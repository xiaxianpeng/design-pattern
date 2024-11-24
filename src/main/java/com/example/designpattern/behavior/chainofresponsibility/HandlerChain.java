package com.example.designpattern.behavior.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

import com.example.designpattern.behavior.chainofresponsibility.handler.Handler;
import com.example.designpattern.behavior.chainofresponsibility.handler.Request;

/**
 * 责任链管理者
 * Created on 2024/11/24 16:50
 */
public class HandlerChain {
    private List<Handler> handlers = new ArrayList<>();

    /**
     * 添加一个处理器到链中。
     */
    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

    /**
     * 通过责任链处理请求。
     * 如果请求被批准，返回true；如果被拒绝，返回false；
     * 如果未处理，抛出异常。
     */
    public boolean process(Request request) {
        for (Handler handler : handlers) {
            Boolean result = handler.process(request);
            if (result != null) {
                System.out.println(request + " " + (result ? "Approved by " : "Denied by ") + handler.getClass().getSimpleName());
                return result;
            }
        }
        throw new RuntimeException("Could not handle request: " + request);
    }
}
