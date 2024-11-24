package com.example.designpattern.behavior.memento;

/**
 * // 发起人类
 * Created on 2024/11/24 22:06
 */
public class TextEditor {
    private StringBuilder buffer = new StringBuilder();

    public void add(char ch) {
        buffer.append(ch);
    }

    public void add(String s) {
        buffer.append(s);
    }

    public void delete() {
        if (buffer.length() > 0) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }

    // 获取状态：
    public Memento save() {
        return new Memento(buffer.toString());
    }

    // 恢复状态：
    public void restore(Memento memento) {
        this.buffer.delete(0, this.buffer.length());
        this.buffer.append(memento.getState());
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}
