package com.example.designpattern.structural.bridge.shape;

import com.example.designpattern.structural.bridge.color.Color;

/**
 * Created on 2024/11/24 11:51
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle with ");
        color.applyColor();
    }
}
