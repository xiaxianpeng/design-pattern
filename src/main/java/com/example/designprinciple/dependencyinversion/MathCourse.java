package com.example.designprinciple.dependencyinversion;

public class MathCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("study math");
    }
}

