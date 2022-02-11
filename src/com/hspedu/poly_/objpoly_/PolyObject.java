package com.hspedu.poly_.objpoly_;

public class PolyObject {
    public static void main(String[] args) {
//        对象多态的特点
//        animal 编译类型就是Animal, 运行类型就是Dog
        Animal animal = new Dog();
//        运行类型是Dog cry输出的是运行类型是cry()
        animal.cry();

//        编译类型animal 运行类型就是 Cat
        animal = new Cat();
        animal.cry(); // 小猫喵喵叫
    }
}
