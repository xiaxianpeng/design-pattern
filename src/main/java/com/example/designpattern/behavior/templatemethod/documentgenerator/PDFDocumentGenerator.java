package com.example.designpattern.behavior.templatemethod.documentgenerator;

/**
 * 具体实现类
 * PDF 文档生成器
 * Created on 2024/11/24 16:38
 */
public class PDFDocumentGenerator extends DocumentGenerator {
    @Override
    protected void formatDocument() {
        System.out.println("Formatting document as PDF...");
    }

    @Override
    protected void outputDocument() {
        System.out.println("Outputting PDF document.");
    }
}
