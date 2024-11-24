package com.example.designpattern.structural.bridge.shape;

import com.example.designpattern.structural.bridge.color.Color;

/**
 * // 细化抽象2
 * Created on 2024/11/24 11:51
 */
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Square with ");
        color.applyColor();
    }
}
