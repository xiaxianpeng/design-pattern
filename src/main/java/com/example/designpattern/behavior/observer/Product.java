package com.example.designpattern.behavior.observer;

import lombok.Data;

/**
 * 产品类
 * Created on 2024/11/24 20:14
 */
@Data
public class Product {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
