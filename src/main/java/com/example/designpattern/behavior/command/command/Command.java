package com.example.designpattern.behavior.command.command;

/**
 * Command 接口定义所有命令的执行和撤销方法。
 */
public interface Command {
    void execute();

    void undo();
}
