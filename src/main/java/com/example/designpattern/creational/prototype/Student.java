package com.example.designpattern.creational.prototype;

import lombok.Data;

/**
 * Created on 2024/11/24 16:07
 */
@Data
public class Student implements Cloneable {
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported for Student", e);
        }
    }
}
