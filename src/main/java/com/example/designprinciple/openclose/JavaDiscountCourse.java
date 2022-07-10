package com.example.designprinciple.openclose;

import java.math.BigDecimal;

/**
 * @author xianpeng.xia
 * on 2022/7/10 23:27
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(String name, BigDecimal price, Integer id) {
        super(name, price, id);
    }

    public BigDecimal getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal("0.8"));
    }
}
