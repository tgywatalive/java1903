package com.hspedu.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
//        instanceof是判断运行类型
        BB bb = new BB();
        System.out.println(bb instanceof BB); // true
        System.out.println(bb instanceof AA); // true

//        aa 编译类型 AA 运行类型BB
        AA aa = new BB();
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);

        Object obj = new Object();
        System.out.println(obj instanceof AA);
    }
}

class AA {} // 父类
class BB extends AA {} // 子类
