package com.example.designpattern.behavior.iterable;

/**
 * 使用示例
 * Created on 2024/11/24 17:53
 */
public class IteratorExample {
    public static void main(String[] args) {
        ReverseArrayCollection<String> collection = new ReverseArrayCollection<>("one", "two", "three");

        for (String s : collection) {
            System.out.println(s);
        }
    }
}
