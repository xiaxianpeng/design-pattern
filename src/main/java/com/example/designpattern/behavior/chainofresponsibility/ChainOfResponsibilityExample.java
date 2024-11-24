package com.example.designpattern.behavior.chainofresponsibility;

import java.math.BigDecimal;

import com.example.designpattern.behavior.chainofresponsibility.handler.CEOHandler;
import com.example.designpattern.behavior.chainofresponsibility.handler.DirectorHandler;
import com.example.designpattern.behavior.chainofresponsibility.handler.ManagerHandler;
import com.example.designpattern.behavior.chainofresponsibility.handler.Request;

/**
 * 使用责任链模式
 * Created on 2024/11/24 16:51
 */
public class ChainOfResponsibilityExample {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new CEOHandler());

        chain.process(new Request("Bob", new BigDecimal("123.45")));
        chain.process(new Request("Alice", new BigDecimal("1234.56")));
        chain.process(new Request("Bill", new BigDecimal("12345.67")));
        chain.process(new Request("John", new BigDecimal("123456.78")));
    }
}
