package com.example.designpattern.structural.decorator.coffeedecorator;

import com.example.designpattern.structural.decorator.coffee.Coffee;

/**
 * // 具体装饰器：牛奶
 * Created on 2024/11/24 13:28
 */
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}
