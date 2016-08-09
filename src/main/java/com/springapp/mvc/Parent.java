package com.springapp.mvc;

public class Parent {

    {
        System.out.println("父类非静态初始化块");
    }

    static {
        System.out.println("父类静态初始化块");
    }

    public Parent() {
        System.out.println("父类的构造方法");
    }

    public static int parentStaticMethod() {
        System.out.println("父类的静态方法");
        return 10;
    }

    public int parentMethod() {
        System.out.println("父类的非静态方法");
        return 10;
    }
}