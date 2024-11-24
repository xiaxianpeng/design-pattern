package com.example.designpattern.behavior.composite.node;

import java.util.List;

/**
 * // 组件接口，定义了所有节点的接口
 */
public interface Node {
    // 添加一个节点为子节点:
    Node add(Node node);

    // 获取子节点:
    List<Node> children();

    // 输出为XML:
    String toXml();
}
