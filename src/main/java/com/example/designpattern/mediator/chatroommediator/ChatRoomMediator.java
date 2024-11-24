package com.example.designpattern.mediator.chatroommediator;

import com.example.designpattern.mediator.User;

// 定义中介者接口
public interface ChatRoomMediator {
    void showMessage(User user, String message);
}
