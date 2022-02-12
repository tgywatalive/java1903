package com.hspedu.homework.homework13;

public class Teacher extends Person {
    private String work_age;

    public Teacher(String name, char sex, int age, String work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public String getWork_age() {
        return work_age;
    }

    public void setWork_age(String work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println(getName() + "我承诺 我会认真教学 java");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

//    输出信息方法
    public void printInfo() {
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + work_age);
        teach();
        System.out.println(this.play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age='" + work_age + '\'' +
                '}' + super.toString();
    }
}
