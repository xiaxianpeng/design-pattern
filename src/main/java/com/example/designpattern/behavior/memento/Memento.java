package com.example.designpattern.behavior.memento;

/**
 * // 备忘录类
 * Created on 2024/11/24 22:05
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
