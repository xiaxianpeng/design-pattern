package com.example.designpattern.flowengine;

import com.example.designpattern.flowengine.FlowEngine.RunData;
import java.util.concurrent.Callable;

/**
 * @author xianpeng.xia
 * on 2022/1/24 10:06 下午
 */
public class NodeExecuteTask implements Callable {

    private FlowNodeInterface flowNodeInterface;
    private RunData runData;
    private Context context;

    public NodeExecuteTask(FlowNodeInterface flowNodeInterface, RunData runData, Context context) {
        this.flowNodeInterface = flowNodeInterface;
        this.runData = runData;
        this.context = context;
    }

    public Object execute() {
        try {
            Object o = flowNodeInterface.invokeNode(runData, context);
            flowNodeInterface.afterInvoke(runData, context);
            return o;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Object call() throws Exception {
        return execute();
    }
}
