package com.example.designpattern.behavior.memento;

/**
 * // 客户端
 * Created on 2024/11/24 22:06
 */
public class MementoExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.add("Hello, ");
        caretaker.saveState(editor);
        System.out.println("State 1: " + editor);

        editor.add("world!");
        caretaker.saveState(editor);
        System.out.println("State 2: " + editor);

        editor.add(" This is a test.");
        System.out.println("State 3: " + editor);

        // 撤销到上一个状态
        caretaker.restoreState(editor);
        System.out.println("Restored to State 2: " + editor);

        // 再次撤销到上一个状态
        caretaker.restoreState(editor);
        System.out.println("Restored to State 1: " + editor);
    }
}
