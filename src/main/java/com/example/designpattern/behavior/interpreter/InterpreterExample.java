package com.example.designpattern.behavior.interpreter;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example.designpattern.behavior.interpreter.expression.Context;
import com.example.designpattern.behavior.interpreter.expression.Expression;
import com.example.designpattern.behavior.interpreter.expression.LiteralExpression;
import com.example.designpattern.behavior.interpreter.expression.VariableExpression;

/**
 * 客户端代码，演示解释器模式。
 * Created on 2024/11/24 17:30
 */
public class InterpreterExample {
    public static void main(String[] args) {
        // 创建上下文，设置变量
        Context context = new Context();
        context.setVariable("time", LocalTime.now().withNano(0));
        context.setVariable("task", "engine");
        context.setVariable("date", LocalDate.now());

        // 创建表达式
        Expression timeExpression = new VariableExpression("time");
        Expression taskExpression = new VariableExpression("task");
        Expression dateExpression = new VariableExpression("date");

        // 构建消息表达式
        Expression message = new LiteralExpression("[")
                .concatenate(timeExpression)
                .concatenate(new LiteralExpression("] start "))
                .concatenate(taskExpression)
                .concatenate(new LiteralExpression(" at "))
                .concatenate(dateExpression)
                .concatenate(new LiteralExpression("..."));

        // 解释并输出结果
        System.out.println(message.interpret(context));
    }
}
