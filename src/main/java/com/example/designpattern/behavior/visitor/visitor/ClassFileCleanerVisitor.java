package com.example.designpattern.behavior.visitor.visitor;

import java.io.File;

/**
 * // 清理Class文件的访问者
 * Created on 2024/11/24 22:36
 */
public class ClassFileCleanerVisitor implements Visitor {
    public void visitDir(File dir) {
    }

    public void visitFile(File file) {
        if (file.getName().endsWith(".class")) {
            System.out.println("Will clean class file: " + file);
        }
    }
}
