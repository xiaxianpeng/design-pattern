package com.example.designpattern.structural.composite.node;

import java.util.ArrayList;
import java.util.List;

/**
 * // 叶子类：文本节点，没有子节点
 * Created on 2024/11/24 12:14
 */
public class TextNode implements Node {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public Node add(Node node) {
        throw new UnsupportedOperationException();
    }

    public List<Node> children() {
        return new ArrayList<>();
    }

    public String toXml() {
        return text;
    }
}
