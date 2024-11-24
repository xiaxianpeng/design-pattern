package com.example.designpattern.structural.facade;

import com.example.designpattern.structural.facade.subsystem.AdminOfIndustry;

/**
 * 客户端代码
 * Created on 2024/11/24 13:44
 */
public class FacadeExample {
    public static void main(String[] args) {
        Facade facade = new Facade();
        AdminOfIndustry.Company company = facade.openCompany("Facade Software Ltd.");
        System.out.println("Company registered with Bank Account: " + company.getBankAccount() + " and Tax Code: " + company.getTaxCode());
    }
}
