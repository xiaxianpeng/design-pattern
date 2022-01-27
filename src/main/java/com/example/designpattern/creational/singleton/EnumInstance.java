package com.example.designpattern.creational.singleton;

/**
 * @author xianpeng.xia
 * on 2022/1/27 8:04 下午
 * 枚举单例
 */
public class EnumInstance {

    private EnumInstance() {
        System.out.println("init");
    }

    public static EnumInstance getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;
        private EnumInstance instance;

        /**
         * jvm保证这个方法绝对只调用一次
         */
        Singleton() {
            instance = new EnumInstance();
        }

        public EnumInstance getInstance() {
            return instance;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> EnumInstance.getInstance());
        Thread t2 = new Thread(() -> EnumInstance.getInstance());
        Thread t3 = new Thread(() -> EnumInstance.getInstance());
        t1.start();
        t2.start();
        t3.start();
    }
}
