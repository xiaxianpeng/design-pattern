package com.example.designpattern.structural.flyweight;

/**
 * Created on 2024/11/24 13:53
 */
public class FlyWeightExample {
    // 示例代码
    public static void main(String[] args) {
        Student s1 = Student.create(1, "Alice");
        Student s2 = Student.create(1, "Alice");
        System.out.println(s1 == s2); // 输出 true，因为复用了缓存的实例
    }
}
