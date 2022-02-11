package com.hspedu.override_;

public class Dog extends Animal {
//    因为Dog是Animal的子类
//    Dog的cry()方法和Animal的cry定义形式一致
//    Dog的cry方法重写了Animal的cry方法
    public void cry() {
        System.out.println("小狗汪汪叫...");
    }

    public String m1() {
        return null;
    }

//    Object不是String的子类 因此报错
//    public Object m2() {
//        return null;
//    }

    /*public  m3() {
        return null;
    }*/

    public void eat() {

    }
}

class AAA {

}

class BBB extends AAA {

}
