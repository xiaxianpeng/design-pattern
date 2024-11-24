package com.example.designpattern.behavior.strategy.discountstrategy;

import java.math.BigDecimal;

/**
 * 策略接口
 */
public interface DiscountStrategy {
    // 计算折扣额度
    BigDecimal getDiscount(BigDecimal total);
}
