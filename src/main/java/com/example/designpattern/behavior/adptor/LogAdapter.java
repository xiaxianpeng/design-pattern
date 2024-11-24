package com.example.designpattern.behavior.adptor;

/**
 * // 日志适配器类，将旧的日志系统适配到新的日志接口
 * Created on 2024/11/24 11:38
 */
public class LogAdapter implements Log {

    private OldLogger oldLogger;

    public LogAdapter(OldLogger oldLogger) {
        this.oldLogger = oldLogger;
    }

    @Override
    public void log(String message) {
        // 使用适配器将新接口的调用转换为旧系统的调用
        oldLogger.oldLog(message);
    }

}
