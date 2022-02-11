package com.hspedu.homework;

public class Homework06 {

}

class Grand {
    String name = "AA";
    private int age = 100;

    public void g1() {
    }
}

class Father extends Grand {
    String id = "001";
    private double score;
    public void f1() {
//        super可以访问父类的name和g1()方法
//        this可以访问除age以外的
    }
}

class Son extends Father {
    String name = "BB";
    public void g1(){}
    private void show(){
//        super id name g1() f1()

    }
}
