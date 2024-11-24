package com.example.designpattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

import com.example.designpattern.behavior.command.command.Command;

/**
 * 负责执行命令和管理已执行的命令。
 * Created on 2024/11/24 17:10
 */
public class CommandInvoker {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        }
    }
}
