package com.example.designpattern.behavior.templatemethod.documentgenerator;

/**
 * 抽象类
 * Created on 2024/11/24 16:37
 */
public abstract class DocumentGenerator {

    // 模板方法
    public final void generateDocument(String content) {
        loadContent(content);
        formatDocument();
        outputDocument();
    }

    // 具体已实现的方法
    private void loadContent(String content) {
        System.out.println("Loading content: " + content);
    }

    // 抽象方法，子类需要实现这些方法
    protected abstract void formatDocument();
    protected abstract void outputDocument();
}
