package com.springapp.mvc;

/**
 * Created by Administrator on 2016/5/13.
 */
public class Person {
    static int a = 0;

    public static void main(String[] args) {

//        Person p=new Person();
//        System.out.println(p.a);
//        change(p);
//        System.out.println(p.a);
//        int b=1;
//        change1(b);
//        System.out.println(b);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(a);
            }
        });
    }

//    private static void change1(int b) {
//        b=2;
//    }
//
//    public static void change(Person  p){
//        p.a=1;
//    }
//}
}
