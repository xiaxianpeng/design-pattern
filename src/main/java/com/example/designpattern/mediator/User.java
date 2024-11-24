package com.example.designpattern.mediator;

import com.example.designpattern.mediator.chatroommediator.ChatRoomMediator;

/**
 * // 用户类
 * Created on 2024/11/24 21:36
 */
public class User {

    private String name;
    private ChatRoomMediator chatMediator;

    public User(String name, ChatRoomMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        chatMediator.showMessage(this, message);
    }

    public void receiveMessage(String senderName, String message) {
        System.out.println(name + " receives from " + senderName + ": " + message);
    }
}
