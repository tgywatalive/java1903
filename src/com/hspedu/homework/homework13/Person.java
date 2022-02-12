package com.hspedu.homework.homework13;

public class Person {
    public String name;
    public char sex;
    public int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    编写一个play方法
    public String play() {
        return name + "爱玩";
    }

    //    返回一个基本信息
    public String basicInfo() {
        return "姓名：" + name + "\n年龄：" + age + "\n性别：" + sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
