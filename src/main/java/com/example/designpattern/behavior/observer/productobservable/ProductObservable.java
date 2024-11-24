package com.example.designpattern.behavior.observer.productobservable;

import com.example.designpattern.behavior.observer.Product;
import com.example.designpattern.behavior.observer.productobserver.ProductObserver;

/**
 * // 被观察者接口
 */
public interface ProductObservable {

    void addObserver(ProductObserver observer);

    void removeObserver(ProductObserver observer);

    void notifyObservers(Product product, String message);
}
