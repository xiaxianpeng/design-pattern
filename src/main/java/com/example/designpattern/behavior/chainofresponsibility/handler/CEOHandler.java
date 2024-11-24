package com.example.designpattern.behavior.chainofresponsibility.handler;

import java.math.BigDecimal;

/**
 * CEO处理者
 * Created on 2024/11/24 16:49
 */
public class CEOHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        return true; // 批准任何请求
    }
}
