package com.hspedu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
//        向上转型 父类的引用指向子类的对象
//        父类的引用名 = new 子类类型();
        Animal animal = new Cat();
        Object obj = new Cat(); // 这样也是可以的
        System.out.println("ok~~");

//        可以调用父类中的所有成员（需遵循访问权限）
//        但是不能调用子类的特有成员
//        因为编译时能调用哪些成员是由编译类型决定的
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

//        多态的向下转型
//
//        语法 子类类型 引用名 = (子类类型) 父类引用;
        Cat cat = (Cat) animal;
        cat.catchMouse();

    }
}
