package com.example.designpattern.structural.decorator.coffeedecorator;

import com.example.designpattern.structural.decorator.coffee.Coffee;

/**
 * // 装饰器
 * Created on 2024/11/24 13:26
 */
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
