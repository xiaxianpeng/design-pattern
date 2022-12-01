package com.example.designpattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        javaVideoFactory.getVideo().produce();

        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        pythonVideoFactory.getVideo().produce();
    }
}
