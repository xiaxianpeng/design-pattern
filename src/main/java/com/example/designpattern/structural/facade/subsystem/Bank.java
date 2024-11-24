package com.example.designpattern.structural.facade.subsystem;

/**
 * // 银行开户
 * Created on 2024/11/24 13:42
 */
public class Bank {

    public String openAccount(String companyId) {
        System.out.println("Opening bank account for company ID: " + companyId);
        return "BANK12345";
    }
}
