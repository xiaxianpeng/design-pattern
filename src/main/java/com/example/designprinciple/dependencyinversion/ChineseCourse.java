package com.example.designprinciple.dependencyinversion;

public class ChineseCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("study chinese");
    }
}
