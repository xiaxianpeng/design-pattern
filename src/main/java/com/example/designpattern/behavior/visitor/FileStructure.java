package com.example.designpattern.behavior.visitor;

import java.io.File;

import com.example.designpattern.behavior.visitor.visitor.Visitor;

/**
 * // 文件结构类
 * Created on 2024/11/24 22:35
 */
public class FileStructure {
    private File path;

    public FileStructure(File path) {
        this.path = path;
    }

    public void handle(Visitor visitor) {
        scan(this.path, visitor);
    }

    private void scan(File file, Visitor visitor) {
        if (file.isDirectory()) {
            visitor.visitDir(file);
            for (File sub : file.listFiles()) {
                scan(sub, visitor);
            }
        } else if (file.isFile()) {
            visitor.visitFile(file);
        }
    }
}
