package com.hspedu.extend_;

public class Sub extends Base {
    public Sub(String name, int age) {
//        1.调用无参构造器如下 或者什么都不写代表super
//      super(); // 父类无参构造器
//        2.调用父类的 Base(String name) 构造器
//      super("hsp");
//        3.调用父类 Base(String name, int age) 构造器
        super("king", 20);
        System.out.println("子类Sub(String name, int age)构造器被调用...");
    }

    public Sub() {
        super("smith", 10); // 默认 调用父类的无参构造器
        System.out.println("sub()...");
    }

    //
    public Sub(String name) {
        super("tome", 30);
        System.out.println("子类Sub(String name)构造器被调用...");
    }

    public void sayOk() {
//        非私有的方法和属性可以在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
//      通过父类提供公共的方法去访问
        System.out.println("n4 =" + getN4());
        callTest400();
    }
}
