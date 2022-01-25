package com.example.designpattern.flowengine;

import com.example.designpattern.flowengine.FlowEngine.RunData;
import org.springframework.stereotype.Service;

/**
 * @author xianpeng.xia
 * on 2022/1/24 11:24 下午
 */
@Service
public class NodeTwo implements FlowNodeInterface {

    @Override
    public Object invokeNode(RunData runData, Context context) {
        System.out.println("执行方法 " + runData.getParam2());
        return runData.getParam2();
    }

    @Override
    public void afterInvoke(RunData runData, Context context) {

    }

    @Override
    public String resultKey() {
        return "NodeTwo";
    }
}
