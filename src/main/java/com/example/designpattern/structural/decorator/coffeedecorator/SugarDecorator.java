package com.example.designpattern.structural.decorator.coffeedecorator;

import com.example.designpattern.structural.decorator.coffee.Coffee;

/**
 * // 具体装饰器：糖
 * Created on 2024/11/24 13:29
 */
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.3;
    }
}
