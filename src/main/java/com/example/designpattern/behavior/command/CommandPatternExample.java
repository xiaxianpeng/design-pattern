package com.example.designpattern.behavior.command;

import com.example.designpattern.behavior.command.command.Command;
import com.example.designpattern.behavior.command.command.CopyCommand;
import com.example.designpattern.behavior.command.command.PasteCommand;

/**
 * 演示命令模式的文本编辑器操作。
 * Created on 2024/11/24 17:11
 */
public class CommandPatternExample {
    public static void main(String[] args) {
        TextEditorReceiver editor = new TextEditorReceiver();
        CommandInvoker invoker = new CommandInvoker();

        Command copyCommand = new CopyCommand(editor);
        Command pasteCommand = new PasteCommand(editor);

        invoker.executeCommand(copyCommand);
        invoker.executeCommand(pasteCommand);
        System.out.println(editor.getState());

        invoker.undoLastCommand(); // 执行撤销操作
        System.out.println(editor.getState());
    }
}
