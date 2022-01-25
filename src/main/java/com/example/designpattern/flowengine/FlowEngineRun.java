package com.example.designpattern.flowengine;

import com.example.designpattern.DesignPatternApplication;
import com.example.designpattern.flowengine.FlowEngine.RunData;
import com.example.designpattern.flowengine.FlowNode.NodeConf;
import com.example.designpattern.util.SpringContextUtil;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author xianpeng.xia
 * on 2022/1/24 11:27 下午
 *
 * 测试类
 */
public class FlowEngineRun {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DesignPatternApplication.class, args);
        ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();

        FlowNode flowNode = Flow.getFlowNode();
        FlowEngine flowEngine = (FlowEngine) applicationContext.getBean("flowEngine");
        RunData runData = new RunData("one", "two");
        Context context = new Context();

        flowEngine.execute(flowNode, runData, context);
        Map<String, Object> adaptorMap = context.getAdaptorMap();
        // 返回值结果
        System.out.println(adaptorMap.get("NodeOne"));
        System.out.println(adaptorMap.get("NodeTwo"));
    }

    public static class Flow {

        private static FlowNode flowNode = new FlowNode();

        static {
            flowNode.add(NodeOne.class, new NodeConf());
            flowNode.add(NodeTwo.class, new NodeConf());
            flowNode.add("three", NodeOne.class, new NodeConf());
            flowNode.add("three", NodeTwo.class, new NodeConf());
        }

        public static FlowNode getFlowNode() {
            return flowNode;
        }
    }
}
