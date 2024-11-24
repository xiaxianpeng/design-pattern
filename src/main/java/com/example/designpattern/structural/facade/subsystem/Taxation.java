package com.example.designpattern.structural.facade.subsystem;

/**
 * // 纳税登记
 * Created on 2024/11/24 13:42
 */
public class Taxation {

    public String applyTaxCode(String companyId) {
        System.out.println("Applying for tax code for company ID: " + companyId);
        return "TAX67890";
    }
}

