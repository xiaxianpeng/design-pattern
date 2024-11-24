package com.example.designpattern.behavior.state.state;

/**
 * // 未连线状态
 * Created on 2024/11/24 22:27
 */
public class DisconnectedState implements State {
    @Override
    public String init() {
        return "";
    }

    @Override
    public String reply(String input) {
        return "";
    }
}
