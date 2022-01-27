package com.example.designpattern.creational.singleton;

/**
 * @author xianpeng.xia
 * on 2022/1/27 1:00 下午
 *
 * 双重校验锁单例
 */
public class DoubleCheckLock {

    /**
     * 1、volatile：JVM在实例化对象的时候会进行优化和指令重排序操作
     * 2、static
     */
    private static volatile DoubleCheckLock INSTANCE = null;

    private DoubleCheckLock() {
        System.out.println("init");
    }

    public static DoubleCheckLock getInstance() {
        // 线程1，2，3到达这里
        if (INSTANCE == null) {
            // 线程1到这里开始继续往下执行，线程2，3等待
            synchronized (DoubleCheckLock.class) {
                // 执行完成后退出同步区域，然后线程2进入同步代码块，如果在这里不加一次判断
                // 就会造成INSTANCE再次被实例化，
                // 由于增加了判断，线程2到这里发现已被实例化，就跳过了if代码块
                if (INSTANCE == null) {
                    System.out.println("---");
                    INSTANCE = new DoubleCheckLock();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> DoubleCheckLock.getInstance());
        Thread t2 = new Thread(() -> DoubleCheckLock.getInstance());
        Thread t3 = new Thread(() -> DoubleCheckLock.getInstance());
        t1.start();
        t2.start();
        t3.start();
    }
}
