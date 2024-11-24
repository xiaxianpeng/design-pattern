package com.example.designpattern.behavior.interpreter.expression;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象表达式的实现，支持连接操作。
 * Created on 2024/11/24 17:33
 */
public class AbstractExpression implements Expression {
    protected List<Expression> expressions = new ArrayList<>();

    @Override
    public Expression concatenate(Expression nextExpression) {
        expressions.add(nextExpression);
        return this;
    }

    @Override
    public String interpret(Context context) {
        StringBuilder result = new StringBuilder();
        for (Expression expression : expressions) {
            result.append(expression.interpret(context));
        }
        return result.toString();
    }
}
