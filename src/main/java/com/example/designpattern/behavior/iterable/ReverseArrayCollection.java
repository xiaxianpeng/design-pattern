package com.example.designpattern.behavior.iterable;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 自定义集合类，支持倒序遍历。
 * Created on 2024/11/24 17:49
 */
public class ReverseArrayCollection<T> implements Iterable<T> {
    // 以数组形式持有集合:
    private T[] array;

    public ReverseArrayCollection(T... objs) {
        // 复制输入的数据到内部数组
        this.array = Arrays.copyOfRange(objs, 0, objs.length);
    }

    @Override
    public Iterator<T> iterator() {
        // 返回一个具体的迭代器（倒序迭代器）
        return new ReverseIterator();
    }

    /**
     * 内部类实现具体迭代器，用于倒序遍历集合。
     */
    class ReverseIterator implements Iterator<T> {
        // 索引位置:
        int index;

        public ReverseIterator() {
            // 创建Iterator时,索引在数组末尾:
            this.index = ReverseArrayCollection.this.array.length;
        }

        @Override
        public boolean hasNext() {
            // 如果索引大于0,那么可以移动到下一个元素(倒序往前移动):
            return index > 0;
        }

        @Override
        public T next() {
            // 将索引移动到下一个元素并返回(倒序往前移动):
            index--;
            return array[index];
        }
    }
}
