package com.hspedu.override_;

public class Override01 {
    public static void main(String[] args) {
    //    演示方法重写的情况
        Dog dog = new Dog();
        dog.cry();
    }
}

class Animal{
    public void cry() {
        System.out.println("动物叫唤...");
    }

    public Object m1() {
        return null;
    }

    public String m2() {
        return null;
    }

    public AAA m3() {
        return null;
    }

    protected void eat() {

    }
}
