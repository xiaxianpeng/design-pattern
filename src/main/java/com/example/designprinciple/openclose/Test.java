package com.example.designprinciple.openclose;

import java.math.BigDecimal;

/**
 * @author xianpeng.xia
 * on 2022/7/10 23:28
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse("Math", new BigDecimal(100), 1);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;

        System.out.println("id = " + iCourse.getId());
        System.out.println("name = " + iCourse.getName());
        System.out.println("originPrice = " + javaDiscountCourse.getOriginPrice());
        System.out.println("discountPrice = " + iCourse.getPrice());
    }

}
