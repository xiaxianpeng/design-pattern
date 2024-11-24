package com.example.designpattern.behavior.interpreter.expression;

/**
 * 抽象表达式接口，定义了解释操作和连接操作。
 */
public interface Expression {
    String interpret(Context context);

    Expression concatenate(Expression nextExpression);
}
