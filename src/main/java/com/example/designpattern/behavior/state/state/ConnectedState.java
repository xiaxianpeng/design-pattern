package com.example.designpattern.behavior.state.state;

/**
 * // 已连线状态
 * Created on 2024/11/24 22:27
 */
public class ConnectedState implements State {
    public String init() {
        return "Hello, I'm Bob.";
    }

    public String reply(String input) {
        if (input.endsWith("?")) {
            return "Yes. " + input.substring(0, input.length() - 1) + "!";
        }
        if (input.endsWith(".")) {
            return input.substring(0, input.length() - 1) + "!";
        }
        return input + "?";
    }
}
