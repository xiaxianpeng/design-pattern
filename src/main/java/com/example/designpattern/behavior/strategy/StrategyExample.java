package com.example.designpattern.behavior.strategy;

import java.math.BigDecimal;

import com.example.designpattern.behavior.strategy.discountstrategy.OverDiscountStrategy;
import com.example.designpattern.behavior.strategy.discountstrategy.PrimeDiscountStrategy;

/**
 * Created on 2024/11/24 16:24
 */
public class StrategyExample {

    public static void main(String[] args) {
        DiscountContext ctx = new DiscountContext();

        // 使用普通会员折扣
        BigDecimal pay1 = ctx.calculatePrice(BigDecimal.valueOf(105));
        System.out.println("普通会员价格: " + pay1);

        // 使用满减折扣
        ctx.setStrategy(new OverDiscountStrategy());
        BigDecimal pay2 = ctx.calculatePrice(BigDecimal.valueOf(105));
        System.out.println("满减折扣价格: " + pay2);

        // 使用Prime会员折扣
        ctx.setStrategy(new PrimeDiscountStrategy());
        BigDecimal pay3 = ctx.calculatePrice(BigDecimal.valueOf(105));
        System.out.println("Prime会员价格: " + pay3);
    }
}
