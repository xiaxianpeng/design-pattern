package com.example.designprinciple.liskovsubstitution.methodinput;

import java.util.HashMap;

public class Base {
    public void method(HashMap hashMap) {
        System.out.println("父类被执行");
    }
}
