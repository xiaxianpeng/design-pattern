package com.example.designprinciple.compositereuse;

public class Test {
    public static void main(String[] args) {
        ProductDao productDao  = new ProductDao(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
