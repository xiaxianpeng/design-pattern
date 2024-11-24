package com.example.designpattern.behavior.state.state;

/**
 * // 忙碌状态
 * Created on 2024/11/24 22:27
 */
public class BusyState implements State {
    public String init() {
        return "I'm busy, please wait.";
    }

    public String reply(String input) {
        return "Please wait, I'm busy.";
    }
}
