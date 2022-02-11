package com.hspedu.homework;

public class Homework03 {
    public static void main(String[] args) {
        Professor professor = new Professor("贾宝玉", 30, "高级", 30000, 1.3);
        professor.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
//    这里再增加一个工资级别
    private double grade;


    public Teacher() {
    }

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //    实现输出一个教师的信息
    public void introduce() {
        System.out.println("姓名 " + name + " 年龄 " + age + " 职称 " + post + " 基本工资 " + salary + " 工资级别 " + grade);
    }
}

class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}
