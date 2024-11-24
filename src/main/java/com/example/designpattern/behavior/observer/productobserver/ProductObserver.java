package com.example.designpattern.behavior.observer.productobserver;

import com.example.designpattern.behavior.observer.Product;

// 观察者接口
public interface ProductObserver {

    void update(Product product, String message);
}
