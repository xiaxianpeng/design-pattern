package com.example.designpattern.behavior.interpreter.expression;

import java.util.ArrayList;
import java.util.List;

/**
 * 终结符表达式，处理固定的字面量。
 * Created on 2024/11/24 17:29
 */
public class LiteralExpression extends AbstractExpression{
    private String literal;

    public LiteralExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public String interpret(Context context) {
        return literal + super.interpret(context);
    }
}
