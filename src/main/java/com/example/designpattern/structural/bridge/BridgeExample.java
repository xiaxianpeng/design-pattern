package com.example.designpattern.structural.bridge;

import com.example.designpattern.structural.bridge.color.GreenColor;
import com.example.designpattern.structural.bridge.color.RedColor;
import com.example.designpattern.structural.bridge.shape.Circle;
import com.example.designpattern.structural.bridge.shape.Shape;
import com.example.designpattern.structural.bridge.shape.Square;

/**
 * // 使用示例
 * Created on 2024/11/24 11:52
 */
public class BridgeExample {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape greenSquare = new Square(new GreenColor());

        redCircle.draw();
        greenSquare.draw();
    }
}
