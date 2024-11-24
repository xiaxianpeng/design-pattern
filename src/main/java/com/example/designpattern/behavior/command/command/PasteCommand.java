package com.example.designpattern.behavior.command.command;

import com.example.designpattern.behavior.command.TextEditorReceiver;

/**
 * PasteCommand 实现了 Command 接口，负责调用接收者进行粘贴操作。
 * Created on 2024/11/24 17:05
 */
public class PasteCommand implements Command {

    private TextEditorReceiver editor;

    public PasteCommand(TextEditorReceiver editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.paste();
    }

    @Override
    public void undo() {
        editor.undoPaste(); // 假设有一个方法可以撤销粘贴
    }
}
