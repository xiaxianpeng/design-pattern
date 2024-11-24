package com.example.designpattern.behavior.memento;

import java.util.Stack;

/**
 * // 负责人类
 * Created on 2024/11/24 22:06
 */
public class Caretaker {
    private Stack<Memento> history = new Stack<>();

    public void saveState(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void restoreState(TextEditor textEditor) {
        if (!history.isEmpty()) {
            textEditor.restore(history.pop());
        }
    }
}
