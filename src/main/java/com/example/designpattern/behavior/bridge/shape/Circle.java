package com.example.designpattern.behavior.bridge.shape;

import com.example.designpattern.behavior.bridge.color.Color;

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
