package com.hspedu.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马1000");
        bmw = null;
        System.gc(); // 主动调用垃圾回收器

        System.out.println("程序退出了...");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
//    重写finalize

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车" + name);
        System.out.println("我们释放了某些资源");

    }
}
