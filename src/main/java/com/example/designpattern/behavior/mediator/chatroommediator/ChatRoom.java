package com.example.designpattern.behavior.mediator.chatroommediator;

import java.util.ArrayList;
import java.util.List;

import com.example.designpattern.behavior.mediator.User;

/**
 * 具体中介者
 * Created on 2024/11/24 21:36
 */
public class ChatRoom implements ChatRoomMediator {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void showMessage(User user, String message) {
        for (User u : users) {
            // 消息不需要发给发送者自己
            if (u != user) {
                u.receiveMessage(user.getName(), message);
            }
        }
    }
}
