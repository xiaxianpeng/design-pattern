package com.example.designpattern.creational.singleton;

/**
 * @author xianpeng.xia
 * on 2022/1/27 7:49 下午
 * 静态内部类单例
 */
public class StaticInnerClass {

    private StaticInnerClass() {
        System.out.println("init");
    }

    public static StaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {

        // 既能保证延迟加载，又能保证线程安全
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> StaticInnerClass.getInstance());
        Thread t2 = new Thread(() -> StaticInnerClass.getInstance());
        t1.start();
        t2.start();
    }
}
