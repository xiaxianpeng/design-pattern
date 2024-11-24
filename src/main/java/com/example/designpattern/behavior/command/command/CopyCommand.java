package com.example.designpattern.behavior.command.command;

import com.example.designpattern.behavior.command.TextEditorReceiver;

/**
 * CopyCommand 实现了 Command 接口，负责调用接收者进行复制操作。
 * Created on 2024/11/24 17:05
 */
public class CopyCommand implements Command {
    private TextEditorReceiver editor;


    public CopyCommand(TextEditorReceiver editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }

    @Override
    public void undo() {
        // 如果复制操作有撤销逻辑，放在这里
    }
}
