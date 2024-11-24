package com.example.designpattern.structural.facade;

import com.example.designpattern.structural.facade.subsystem.AdminOfIndustry;
import com.example.designpattern.structural.facade.subsystem.Bank;
import com.example.designpattern.structural.facade.subsystem.Taxation;

/**
 * 外观接口
 * Created on 2024/11/24 13:43
 */
public class Facade {

    private AdminOfIndustry admin = new AdminOfIndustry();
    private Bank bank = new Bank();
    private Taxation taxation = new Taxation();

    public AdminOfIndustry.Company openCompany(String name) {
        AdminOfIndustry.Company company = admin.register(name);
        String bankAccount = bank.openAccount(company.getId());
        company.setBankAccount(bankAccount);
        String taxCode = taxation.applyTaxCode(company.getId());
        company.setTaxCode(taxCode);
        return company;
    }
}
