package com.example.designpattern.behavior.mediator.chatroommediator;

import com.example.designpattern.behavior.mediator.User;

// 定义中介者接口
public interface ChatRoomMediator {
    void showMessage(User user, String message);
}
