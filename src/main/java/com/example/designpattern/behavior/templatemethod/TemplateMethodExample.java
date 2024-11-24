package com.example.designpattern.behavior.templatemethod;

import com.example.designpattern.behavior.templatemethod.documentgenerator.DocumentGenerator;
import com.example.designpattern.behavior.templatemethod.documentgenerator.HTMLDocumentGenerator;
import com.example.designpattern.behavior.templatemethod.documentgenerator.PDFDocumentGenerator;

/**
 * 使用模板方法
 * Created on 2024/11/24 16:39
 */
public class TemplateMethodExample {
    public static void main(String[] args) {
        DocumentGenerator pdfGenerator = new PDFDocumentGenerator();
        pdfGenerator.generateDocument("This is a PDF document content.");

        DocumentGenerator htmlGenerator = new HTMLDocumentGenerator();
        htmlGenerator.generateDocument("This is an HTML document content.");
    }
}
