package com.example.designpattern.flowengine;

import com.example.designpattern.flowengine.FlowEngine.RunData;
import org.springframework.stereotype.Service;

/**
 * @author xianpeng.xia
 * on 2022/1/24 11:21 下午
 */
@Service
public class NodeOne implements FlowNodeInterface {

    @Override
    public Object invokeNode(RunData runData, Context context) {
        System.out.println("执行方法 " + runData.getParam1());
        return runData.getParam1();
    }

    @Override
    public void afterInvoke(RunData runData, Context context) {

    }

    @Override
    public String resultKey() {
        return "NodeOne";
    }
}
