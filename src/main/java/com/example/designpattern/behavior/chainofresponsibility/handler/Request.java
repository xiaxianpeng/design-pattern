package com.example.designpattern.behavior.chainofresponsibility.handler;

import java.math.BigDecimal;

/**
 * 请求类
 * Created on 2024/11/24 16:49
 */
public class Request {
    private String name;
    private BigDecimal amount;

    public Request(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Request{name='" + name + "', amount=" + amount + '}';
    }
}
