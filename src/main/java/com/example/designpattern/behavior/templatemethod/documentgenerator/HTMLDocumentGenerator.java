package com.example.designpattern.behavior.templatemethod.documentgenerator;

/**
 * 具体实现类
 * HTML 文档生成器
 * Created on 2024/11/24 16:38
 */
public class HTMLDocumentGenerator extends DocumentGenerator {
    @Override
    protected void formatDocument() {
        System.out.println("Formatting document as HTML...");
    }

    @Override
    protected void outputDocument() {
        System.out.println("Outputting HTML document.");
    }
}
