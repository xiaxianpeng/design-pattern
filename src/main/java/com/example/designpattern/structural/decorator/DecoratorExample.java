package com.example.designpattern.structural.decorator;

import com.example.designpattern.structural.decorator.coffee.Coffee;
import com.example.designpattern.structural.decorator.coffee.SimpleCoffee;
import com.example.designpattern.structural.decorator.coffeedecorator.MilkDecorator;
import com.example.designpattern.structural.decorator.coffeedecorator.SugarDecorator;

/**
 * // 使用示例
 * Created on 2024/11/24 13:29
 */
public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
