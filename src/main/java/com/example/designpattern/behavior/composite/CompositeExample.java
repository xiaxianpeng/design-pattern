package com.example.designpattern.behavior.composite;

import com.example.designpattern.behavior.composite.node.CommentNode;
import com.example.designpattern.behavior.composite.node.ElementNode;
import com.example.designpattern.behavior.composite.node.Node;
import com.example.designpattern.behavior.composite.node.TextNode;

/**
 * // 使用示例
 * Created on 2024/11/24 12:16
 */
public class CompositeExample {

    public static void main(String[] args) {

        Node root = new ElementNode("school");

        root.add(new ElementNode("classA")
                .add(new TextNode("Tom"))
                .add(new TextNode("Alice")));

        root.add(new ElementNode("classB")
                .add(new TextNode("Bob"))
                .add(new TextNode("Grace"))
                .add(new CommentNode("comment...")));

        System.out.println(root.toXml());
    }
}
