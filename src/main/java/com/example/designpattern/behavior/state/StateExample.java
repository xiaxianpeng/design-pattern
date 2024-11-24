package com.example.designpattern.behavior.state;

import java.util.Scanner;

/**
 * 客户端
 * Created on 2024/11/24 22:29
 */
public class StateExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BotContext bot = new BotContext();
        for (; ; ) {
            System.out.print("> ");
            String input = scanner.nextLine();
            String output = bot.chat(input);
            System.out.println(output.isEmpty() ? "(no reply)" : "< " + output);
        }
    }
}
