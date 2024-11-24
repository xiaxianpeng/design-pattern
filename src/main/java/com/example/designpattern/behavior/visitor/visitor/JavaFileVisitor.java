package com.example.designpattern.behavior.visitor.visitor;

import java.io.File;

/**
 * // 查找Java文件的访问者
 * Created on 2024/11/24 22:36
 */
public class JavaFileVisitor implements Visitor {
    public void visitDir(File dir) {
        System.out.println("Visit dir: " + dir);
    }

    public void visitFile(File file) {
        if (file.getName().endsWith(".java")) {
            System.out.println("Found java file: " + file);
        }
    }
}
