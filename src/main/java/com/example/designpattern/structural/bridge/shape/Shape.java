package com.example.designpattern.structural.bridge.shape;

import com.example.designpattern.structural.bridge.color.Color;

/**
 * // 抽象类
 * Created on 2024/11/24 11:50
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
