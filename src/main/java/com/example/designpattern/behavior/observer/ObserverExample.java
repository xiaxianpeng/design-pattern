package com.example.designpattern.behavior.observer;

import com.example.designpattern.behavior.observer.productobservable.Store;
import com.example.designpattern.behavior.observer.productobserver.Admin;
import com.example.designpattern.behavior.observer.productobserver.Customer;

/**
 * 客户端
 * Created on 2024/11/24 20:15
 */
public class ObserverExample {
    public static void main(String[] args) {
        Store store = new Store();

        Customer customer = new Customer("Alice");
        Admin admin = new Admin("Bob");

        store.addObserver(customer);
        store.addObserver(admin);

        store.addNewProduct("Laptop", 999.99);
        store.setProductPrice("Laptop", 899.99);
    }
}
