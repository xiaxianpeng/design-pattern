package com.example.designpattern.flowengine;


import com.example.designpattern.flowengine.FlowEngine.RunData;

/**
 * @author xianpeng.xia
 * on 2022/1/24 9:17 下午
 */
public interface FlowNodeInterface<T> {

    /**
     * Node的执行方法
     */
    T invokeNode(RunData runData, Context context);

    /**
     * Node执行完后的执行方法
     */
    void afterInvoke(RunData runData, Context context);

    /**
     * 从Context中获取此node结果的key
     */
    String resultKey();
}
