package com.example.designpattern.behavior.state.state;

// 状态接口
public interface State {
    String init();

    String reply(String input);
}
