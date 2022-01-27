package com.example.designpattern.creational.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author xianpeng.xia
 * on 2022/1/27 12:36 下午
 * CAS方式单例
 */
public class CAS {

    /**
     * 1、 static
     * 2、 AtomicReference
     */
    private static final AtomicReference<CAS> INSTANCE = new AtomicReference<>();

    private CAS() {
        System.out.println("init");
    }

    public static final CAS getSingleton() {
        for (; ; ) {
            CAS current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            // new单例
            current = new CAS();
            // compareAndSet
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }

    public static void main(String[] args) {

        CAS s1 = CAS.getSingleton();
        CAS s2 = CAS.getSingleton();
        Thread t1 = new Thread(() -> CAS.getSingleton());
        Thread t2 = new Thread(() -> CAS.getSingleton());
        t1.start();
        t2.start();
        System.out.println(s1 == s2);
    }
}
