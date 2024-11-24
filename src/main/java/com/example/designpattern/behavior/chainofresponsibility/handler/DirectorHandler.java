package com.example.designpattern.behavior.chainofresponsibility.handler;

import java.math.BigDecimal;

/**
 * 总监处理者
 * 可以批准金额不超过10000的请求。
 * Created on 2024/11/24 16:49
 */
public class DirectorHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if (request.getAmount().compareTo(BigDecimal.valueOf(10000)) > 0) {
            return null;// 传递给下一个处理器
        }
        return true;// 批准请求
    }
}
