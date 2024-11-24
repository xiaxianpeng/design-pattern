package com.example.designpattern.behavior.interpreter.expression;

/**
 * 非终结符表达式，用于解析变量。
 * Created on 2024/11/24 17:29
 */
public class VariableExpression extends AbstractExpression {
    private String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String interpret(Context context) {
        Object value = context.getVariable(variableName);
        return (value != null ? value.toString() : "") + super.interpret(context);
    }
}
