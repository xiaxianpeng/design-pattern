package com.example.designpattern.structural.proxy;

/**
 * // 实现接口的真实主题类
 * Created on 2024/11/24 15:43
 */
public class RealService implements Service {
    @Override
    public void performAction() {
        System.out.println("Performing action in RealService");
    }
}
