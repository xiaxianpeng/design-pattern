package com.example.designpattern.behavior.adptor;

/**
 * // 使用示例
 * Created on 2024/11/24 11:40
 */
public class AdapterExample {
    public static void main(String[] args) {
        OldLogger oldLogger = new OldLogger();
        Log logger = new LogAdapter(oldLogger);

        // 通过适配器来使用旧的日志系统
        logger.log("This is a log message.");
    }
}
