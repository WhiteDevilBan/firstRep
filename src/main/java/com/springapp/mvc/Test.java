package com.springapp.mvc;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;

/**
 * Created by Administrator on 2016/4/27.
 */
public class Test {

    private static final ThreadLocal threadLocal = new ThreadLocal(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };


    public static void main(String[] args) {
//        for (int i=0;i<5;i++) {
//            final int finalI = i;
//            Thread t = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    threadLocal.set(finalI +"");
//                    System.out.println(Thread.currentThread().getName() + ".." + threadLocal.get());
//                }
//            }, i + "-thread");
//            t.start();
////            System.out.println(Thread.currentThread().getName() + ".." + threadLocal.get());
//        }
//
//        AtomicInteger integer = new AtomicInteger();
//        integer.getAndAdd(1273);
//        System.out.println(integer);
//        ConcurrentHashMap map = new ConcurrentHashMap();
//        map.put("key","value");
//        System.out.println(map.get("key"));

        Condition condition = new ReentrantLock().newCondition();
        String result = null;
        Future future = new FutureTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("ss");
            }
        }, result);
    }

}
