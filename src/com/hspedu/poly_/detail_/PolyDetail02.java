package com.hspedu.poly_.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {
        //    属性没有重写之说
        Base base = new Sub();
        System.out.println(base.count); // 看编译类型
        Sub sub = new Sub();
        System.out.println(sub.count);
    }


}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}