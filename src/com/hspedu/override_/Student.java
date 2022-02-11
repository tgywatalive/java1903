package com.hspedu.override_;

public class Student extends Person {
    private int id;
    private double score;


    public Student(String name, int age, int id, double score) {
        super(name, age); // 这里会调用父类构造器
        this.id = id;
        this.score = score;
    }

//    say
    public String say() {
        // 这里体现super的好处 代码复用
        return super.say() + " id=" + id + " score=" + score;
    }
}


