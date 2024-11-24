package com.example.designpattern.structural.bridge.color;

/**
 * // 具体实现者1
 * Created on 2024/11/24 11:48
 */
public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
