package com.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {
        B a = new A();
        System.out.println(a instanceof A);
//        A b = a;
//        A c = b;
//        B bb = new B();
//        System.out.println(a == c); // T
//        System.out.println(b == c); // T
//        B bObj = a;
//
//        System.out.println(bObj == c); // T
//        int num1 = 10;
//        double num2 = 10.0;
//        System.out.println(num1 == num2); // 基本数据类型 判断值是否相等 T
//        System.out.println( "hello".equals("hello"));

    }
}

class B {

}

class A extends B {

}
