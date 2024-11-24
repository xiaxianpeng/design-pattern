package com.example.designpattern.structural.composite.node;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * // 叶子类：元素节点，可以包含子节点
 * Created on 2024/11/24 12:13
 */
public class ElementNode implements Node {

    private String name;
    private List<Node> children = new ArrayList<>();

    public ElementNode(String name) {
        this.name = name;
    }

    public Node add(Node node) {
        children.add(node);
        return this;
    }

    public List<Node> children() {
        return children;
    }

    public String toXml() {
        String start = "<" + name + ">\n";
        String end = "</" + name + ">\n";
        StringJoiner sj = new StringJoiner("", start, end);
        children.forEach(node -> {
            sj.add(node.toXml() + "\n");
        });
        return sj.toString();
    }
}
