package com.example.designpattern.creational.factorymethod;

public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
