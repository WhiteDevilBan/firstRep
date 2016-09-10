package aop;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Administrator on 2016/8/23.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        People people = new PeopleImpl();
        MyInvocationHandler handler = new MyInvocationHandler(people);
        People proxy = (People) handler.getProxy();

        proxy.speak();

        int a1=1,a2=2,a3,a4;
        final int a5=5,a6=6,a7,a8;
        a3=a1+a5;
        a7 = a1+a2;
        Thread t = new Thread();
        t.wait();

    }
}
