package com.example.designpattern.flowengine;


import com.example.designpattern.flowengine.FlowNode.NodeConf;
import com.example.designpattern.util.SpringContextUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author xianpeng.xia
 * on 2022/1/24 8:50 下午
 *
 * 引擎类，这个也是我们的核心类。
 * 通过我们添加的node节点判断我们哪些流程是需要串行的那些是需要并行的，
 * 通过线程池创建线程放入Feature中，来达到同步执行的效果。
 */
@Service
public class FlowEngine {

    /**
     * 引擎的执行入口
     */
    public void execute(FlowNode flowNode, RunData runData, Context context) throws Exception {
        Map<String, List<String>> nodeGroup = groupByGroupName(flowNode);
        Map<String, NodeConf> nodeMap = flowNode.getNodeMap();

        for (String groupName : nodeGroup.keySet()) {
            boolean needThrowExp = false;
            List<String> nodeNameList = nodeGroup.get(groupName);
            // 只有一个Node的节点，串行执行
            if (nodeNameList.size() == 1) {
                String nodeName = nodeNameList.get(0);
                FlowNodeInterface detailNode = (FlowNodeInterface) SpringContextUtil.getSingleBeanByType(Class.forName(nodeName));
                NodeExecuteTask nodeExecuteTask = new NodeExecuteTask(detailNode, runData, context);
                try {
                    Object result = nodeExecuteTask.execute();
                    context.getAdaptorMap().put(detailNode.resultKey(), result);
                } catch (Exception e) {
                    needThrowExp = true;
                }
            } else {
                // 多个节点的，并行执行
                List<Future> resultList = new ArrayList<>();
                List<String> executedNodeNameList = new ArrayList<>();
                List<NodeExecuteTask> executedNodeList = new ArrayList<>();

                for (String nodeName : nodeNameList) {
                    FlowNodeInterface detailNode = (FlowNodeInterface) SpringContextUtil.getSingleBeanByType(Class.forName(nodeName));

                    NodeExecuteTask nodeExecuteTask = new NodeExecuteTask(detailNode, runData, context);
                    executedNodeNameList.add(nodeName);
                    executedNodeList.add(nodeExecuteTask);
                    resultList.add(threadPool.submit(nodeExecuteTask));
                }
                // 执行结果
                for (int i = 0; i < resultList.size(); i++) {
                    String nodeName = executedNodeNameList.get(i);
                    String nodeKey = groupName + "_" + nodeName;
                    FlowNodeInterface detailNode = (FlowNodeInterface) SpringContextUtil.getSingleBeanByType(Class.forName(nodeName));

                    NodeConf nodeConf = nodeMap.get(nodeKey);
                    int timeout = nodeConf.getTimeout();
                    Future future = resultList.get(i);

                    try {
                        Object o = future.get(timeout, TimeUnit.MINUTES);
                        context.getAdaptorMap().put(detailNode.resultKey(), o);
                    } catch (InterruptedException e) {
                        needThrowExp = true;
                    } catch (ExecutionException e) {
                        needThrowExp = true;
                    } catch (TimeoutException e) {
                        needThrowExp = true;
                    } catch (Exception e) {
                        needThrowExp = true;
                    }
                }
                if (needThrowExp) {
                    throw new RuntimeException();
                }
            }

        }
    }

    private Map<String, List<String>> groupByGroupName(FlowNode flowNode) {
        Map<String, List<String>> nodeGroup = new LinkedHashMap<>();
        for (String nodeKey : flowNode.getNodeList()) {
            String groupName = getGroupName(nodeKey);
            String nodeName = getNodeName(nodeKey);

            if (StringUtils.isBlank(groupName)) {
                List<String> nodeNameList = new ArrayList<>();
                nodeNameList.add(nodeName);
                nodeGroup.put(nodeName, nodeNameList);
            } else {
                List<String> nodeNameList = nodeGroup.get(groupName);
                if (nodeNameList == null) {
                    nodeNameList = new ArrayList<>();
                }
                nodeNameList.add(nodeName);
                nodeGroup.put(groupName, nodeNameList);
            }
        }
        return nodeGroup;
    }

    private String getGroupName(String nodeKey) {
        String[] arr = nodeKey.split("_");
        return arr.length == 2 ? arr[0] : null;
    }

    private String getNodeName(String nodeKey) {
        String[] arr = nodeKey.split("_");
        return arr.length == 2 ? arr[1] : arr[0];
    }

    /**
     * 流程中的参数
     */
    public static class RunData {

        private String param1;
        private String param2;

        public RunData(String param1, String param2) {
            this.param1 = param1;
            this.param2 = param2;
        }

        public RunData() {
        }

        public String getParam1() {
            return param1;
        }

        public void setParam1(String param1) {
            this.param1 = param1;
        }

        public String getParam2() {
            return param2;
        }

        public void setParam2(String param2) {
            this.param2 = param2;
        }
    }

    public static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10,
        60L, TimeUnit.MINUTES,
        new LinkedBlockingQueue<Runnable>(500),
        new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("engine processor");
                return thread;
            }
        },
        new AbortPolicy());
}
