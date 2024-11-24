package com.example.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * // Student类示例，展示了享元模式的应用
 * Created on 2024/11/24 13:51
 */
public class Student implements FlyweightStudent {
    // Student类的私有字段
    private final int id;
    private final String name;

    // 私有构造函数，防止外部直接实例化
    private Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    // 持有缓存，存储已创建的实例
    private static final Map<String, Student> cache = new HashMap<>();

    // // 静态工厂方法作为享元工厂，通过工厂方法来管理对象的创建
    public static Student create(int id, String name) {
        String key = id + "\n" + name;
        // 先查找缓存，看是否已有实例
        Student std = cache.get(key);
        if (std == null) {
            // 缓存中不存在，创建新对象
            System.out.println(String.format("create new Student(%d, %s)", id, name));
            std = new Student(id, name);
            // 将新创建的对象放入缓存
            cache.put(key, std);
        } else {
            // 缓存中存在，返回缓存实例
            System.out.println(String.format("return cached Student(%d, %s)", std.id, std.name));
        }
        return std;
    }


}
