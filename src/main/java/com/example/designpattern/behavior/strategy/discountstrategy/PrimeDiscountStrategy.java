package com.example.designpattern.behavior.strategy.discountstrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Prime会员折扣策略
 * 在满减基础上再提供七折优惠
 * Created on 2024/11/24 16:22
 */
public class PrimeDiscountStrategy implements DiscountStrategy{
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        BigDecimal discount = total.compareTo(BigDecimal.valueOf(100)) >= 0 ? BigDecimal.valueOf(20) : BigDecimal.ZERO;
        BigDecimal finalAmount = total.subtract(discount);
        return finalAmount.multiply(new BigDecimal("0.3")).setScale(2, RoundingMode.DOWN);
    }
}
