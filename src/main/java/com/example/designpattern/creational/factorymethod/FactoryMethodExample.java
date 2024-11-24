package com.example.designpattern.creational.factorymethod;

import com.example.designpattern.creational.factorymethod.videofacrory.JavaVideoFactory;
import com.example.designpattern.creational.factorymethod.videofacrory.PythonVideoFactory;
import com.example.designpattern.creational.factorymethod.videofacrory.VideoFactory;

public class FactoryMethodExample {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        javaVideoFactory.getVideo().produce();

        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        pythonVideoFactory.getVideo().produce();
    }
}
