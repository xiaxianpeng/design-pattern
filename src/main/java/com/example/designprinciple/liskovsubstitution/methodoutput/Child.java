package com.example.designprinciple.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap<Object, Object> hashMap = new HashMap<>();
        System.out.println("子类方法被执行");
        hashMap.put("message", "子类方法被执行");
        return hashMap;
    }
}
