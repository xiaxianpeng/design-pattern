package com.example.designprinciple.liskovsubstitution.interfaceclass;

public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("resize width=" + rectangle.getWidth() + ",length=" + rectangle.getLength());
        }
        System.out.println("resize end width=" + rectangle.getWidth() + ",length=" + rectangle.getLength());
    }

    /*
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
    }*/

    public static void main(String[] args) {
        // 不符合里氏替换原则，不能使用resize方法
        Square square = new Square();
        square.setSideLength(20);
        //resize(square);
    }
}
