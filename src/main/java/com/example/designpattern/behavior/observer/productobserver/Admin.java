package com.example.designpattern.behavior.observer.productobserver;

import com.example.designpattern.behavior.observer.Product;

/**
 * // 具体观察者
 * Created on 2024/11/24 20:13
 */
public class Admin implements ProductObserver {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product, String message) {
        System.out.println("Admin " + name + " notified: " + message + " - " + product.getName() + ", Price: " + product.getPrice());
    }
}
