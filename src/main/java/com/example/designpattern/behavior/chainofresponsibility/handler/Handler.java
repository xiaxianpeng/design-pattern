package com.example.designpattern.behavior.chainofresponsibility.handler;

/**
 * 抽象处理者
 */
public interface Handler {
    Boolean process(Request request);
}
