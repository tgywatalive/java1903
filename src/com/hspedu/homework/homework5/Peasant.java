package com.hspedu.homework.homework5;

public class Peasant extends Employee { // 子类
//    属性

    public Peasant(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("农民 ");
        super.printSal();


    }
}
