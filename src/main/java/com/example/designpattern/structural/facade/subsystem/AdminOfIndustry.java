package com.example.designpattern.structural.facade.subsystem;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * // 工商注册
 * Created on 2024/11/24 13:38
 */
public class AdminOfIndustry {
    public Company register(String name) {
        System.out.println("Registering company: " + name);
        return new Company(name).setId("1").setBankAccount("ba").setTaxCode("t");
    }

    @Data
    @Accessors(chain = true)
    public static class Company {
        private String id;
        private String name;
        private String bankAccount;
        private String taxCode;

        public Company(String name) {
            this.name = name;
        }
    }

}
