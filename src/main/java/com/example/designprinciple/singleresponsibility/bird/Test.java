package com.example.designprinciple.singleresponsibility.bird;

public class Test {
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        flyBird.mainMoveMode("鸵鸟");
    }
}
