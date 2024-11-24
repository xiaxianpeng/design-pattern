package com.example.designpattern.behavior.interpreter.expression;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文类，保存解释器执行时的全局信息。
 * Created on 2024/11/24 17:27
 */
public class Context {
    private Map<String, Object> variables = new HashMap<>();

    public void setVariable(String name, Object value) {
        variables.put(name, value);
    }

    public Object getVariable(String name) {
        return variables.get(name);
    }
}
