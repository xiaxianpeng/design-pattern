package com.example.designpattern.flowengine;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xianpeng.xia
 * on 2022/1/24 8:20 下午
 * Context 上下文，作为我们的调用下游服务的返回结果
 */
public class Context {

    private Map<String, Object> resultMap = new HashMap<>();

    public Map<String, Object> getAdaptorMap() {
        return resultMap;
    }

    public void setAdaptorMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }
}
