package com.example.designpattern.behavior.strategy.discountstrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 普通用户折扣策略
 * 普通用户享受九折优惠
 * Created on 2024/11/24 16:21
 */
public class UserDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        return total.multiply(new BigDecimal("0.1")).setScale(2, RoundingMode.DOWN);
    }
}
