package com.example.designpattern.behavior.strategy;

import java.math.BigDecimal;

import com.example.designpattern.behavior.strategy.discountstrategy.DiscountStrategy;
import com.example.designpattern.behavior.strategy.discountstrategy.UserDiscountStrategy;

/**
 * 上下文类
 * Created on 2024/11/24 16:23
 */
public class DiscountContext {
    // 持有某个策略
    private DiscountStrategy strategy = new UserDiscountStrategy();

    // 设置新策略
    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal calculatePrice(BigDecimal total) {
        return total.subtract(this.strategy.getDiscount(total)).setScale(2);
    }
}
