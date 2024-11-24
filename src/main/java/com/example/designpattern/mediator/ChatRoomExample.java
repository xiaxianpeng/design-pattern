package com.example.designpattern.mediator;

import com.example.designpattern.mediator.chatroommediator.ChatRoom;

/**
 * 客户端代码
 * Created on 2024/11/24 21:37
 */
public class ChatRoomExample {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi, Alice!");
        user3.sendMessage("Hey, Alice and Bob!");
    }
}
