package com.example.designpattern.structural.proxy;

/**
 * // 客户端代码
 * Created on 2024/11/24 15:45
 */
public class ProxyExample {
    public static void main(String[] args) {
        Service realService = new RealService();
        Service proxyService = new PermissionProxy(realService);

        try {
            proxyService.performAction();
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
    }
}
