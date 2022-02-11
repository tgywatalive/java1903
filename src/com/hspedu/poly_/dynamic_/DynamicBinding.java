package com.hspedu.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
//        a的编译类型是大写的A 运行类型是大写的B
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
