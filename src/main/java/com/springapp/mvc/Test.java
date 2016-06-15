package com.springapp.mvc;

import sun.nio.ch.ThreadPool;

import java.util.Arrays;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;

/**
 * Created by Administrator on 2016/4/27.
 */
public class Test {

    private static final ThreadLocal threadLocal = new ThreadLocal() {
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
//
//        Condition condition = new ReentrantLock().newCondition();
//        String result = null;
//        Future future = new FutureTask(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("ss");
//            }
//        }, result);
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
        System.out.println(d.equals(c));
        String aa= "hello";
        String bb = "hello";
        String cc = new String("hello");
        System.out.println(aa == bb);
        System.out.println(aa == cc);
        ll("s","s","k");
        final String s= "s";
        String ab = s;
        System.out.println(null == null);
        StringBuilder sb =new StringBuilder();
        sb.append(1).append(2).append(3);
//        Person
    }

    private static void ll(String... s) {
        System.out.println(Arrays.toString(s));
    }

}
