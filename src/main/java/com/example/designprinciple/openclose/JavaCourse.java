package com.example.designprinciple.openclose;

import java.math.BigDecimal;

/**
 * @author xianpeng.xia
 * on 2022/7/10 23:26
 */
public class JavaCourse implements ICourse {

    private String name;
    private BigDecimal price;
    private Integer id;

    public JavaCourse(String name, BigDecimal price, Integer id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }
}
