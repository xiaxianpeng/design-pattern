package com.example.designpattern.behavior.command;

/**
 * TextEditorReceiver 是命令的接收者，执行具体的文本编辑操作。
 * Created on 2024/11/24 17:08
 */
public class TextEditorReceiver {
    private StringBuilder content = new StringBuilder();

    public void copy() {
        // 复制逻辑
    }

    public void paste() {
        String text = getClipboardContent();
        appendText(text);
    }

    public void appendText(String text) {
        content.append(text);
    }

    public void deleteLastCharacter() {
        if (content.length() > 0) {
            content.deleteCharAt(content.length() - 1);
        }
    }

    public String getState() {
        return content.toString();
    }

    public void undoPaste() {
        // 撤销粘贴逻辑
    }

    private String getClipboardContent() {
        // 模拟从剪贴板获取文本
        return "clipboard_text";
    }
}
