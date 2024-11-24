package com.example.designpattern.behavior.visitor;

import java.io.File;

import com.example.designpattern.behavior.visitor.visitor.ClassFileCleanerVisitor;
import com.example.designpattern.behavior.visitor.visitor.JavaFileVisitor;

/**
 * Created on 2024/11/24 22:37
 */
public class VisitorExample {

    public static void main(String[] args) {
        FileStructure fs = new FileStructure(new File("."));

        // 使用JavaFileVisitor进行访问
        fs.handle(new JavaFileVisitor());

        // 使用ClassFileCleanerVisitor进行访问
        fs.handle(new ClassFileCleanerVisitor());
    }
}