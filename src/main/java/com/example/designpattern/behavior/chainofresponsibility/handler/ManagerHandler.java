package com.example.designpattern.behavior.chainofresponsibility.handler;

import java.math.BigDecimal;

/**
 * 经理处理者
 * 可以批准金额不超过1000的请求。
 * Created on 2024/11/24 16:49
 */
public class ManagerHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if (request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0) {
            return null;// 传递给下一个处理器
        }
        // 对Bob的请求有偏见，拒绝处理
        return !request.getName().equalsIgnoreCase("bob");
    }
}
