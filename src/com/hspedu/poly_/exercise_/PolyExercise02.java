package com.hspedu.poly_.exercise_;

import com.hspedu.extend_.Sub;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub2 s = new Sub2();
        System.out.println(s.count);
        s.display();
        Base b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }
}

class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub2 extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}