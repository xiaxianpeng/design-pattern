package com.example.designpattern.structural.decorator.coffee;

/**
 * // 具体组件
 * Created on 2024/11/24 12:37
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
