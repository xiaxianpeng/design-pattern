package com.example.designpattern.behavior.observer.productobservable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.designpattern.behavior.observer.Product;
import com.example.designpattern.behavior.observer.productobserver.ProductObserver;

/**
 * // 具体被观察者
 * Created on 2024/11/24 20:11
 */
public class Store implements ProductObservable {
    private List<ProductObserver> observers = new ArrayList<>();
    private Map<String, Product> products = new HashMap<>();

    @Override
    public void addObserver(ProductObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ProductObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Product product, String message) {
        for (ProductObserver observer : observers) {
            observer.update(product, message);
        }
    }

    public void addNewProduct(String name, double price) {
        Product product = new Product(name, price);
        products.put(name, product);
        notifyObservers(product, "New product added");
    }

    public void setProductPrice(String name, double price) {
        Product product = products.get(name);
        if (product != null) {
            product.setPrice(price);
            notifyObservers(product, "Product price changed");
        }
    }
}
