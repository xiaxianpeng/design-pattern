package com.example.designpattern.behavior.observer.productobserver;

import com.example.designpattern.behavior.observer.Product;

/**
 * // 具体观察者
 * Created on 2024/11/24 20:13
 */
public class Customer implements ProductObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product, String message) {
        System.out.println("Customer " + name + " notified: " + message + " - " + product.getName() + ", Price: " + product.getPrice());
    }
}
