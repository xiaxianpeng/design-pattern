package com.example.designpattern.behavior.strategy.discountstrategy;

import java.math.BigDecimal;

/**
 * 满减折扣策略
 * 消费满100减20的优惠策略
 * Created on 2024/11/24 16:22
 */
public class OverDiscountStrategy implements DiscountStrategy {
    public BigDecimal getDiscount(BigDecimal total) {
        return total.compareTo(BigDecimal.valueOf(100)) >= 0 ? BigDecimal.valueOf(20) : BigDecimal.ZERO;
    }
}
