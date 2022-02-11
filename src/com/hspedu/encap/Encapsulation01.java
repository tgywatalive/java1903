package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
//        使用快捷键alt+r 需要先配置主类
//        第一次 我们使用点击形式运算程序 后面就可以用
        Person person = new Person();
        person.setName("韩顺平");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());

//        如果我们直接使用构造器设置属性
        Person smith = new Person("smith", 80, 50000);
        System.out.println("===smith的信息===");
        System.out.println(smith.info());
    }
}

class Person {
    public String name; // 名字公开
    private int age; // 年龄私有化
    private double salary;

//    构造器

    public Person() {
    }
//  三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        我们可以将set方法写在构造器中 这样仍然可以验证数据  不然会被破解
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        加入对数据的校验检测 相当于增加了业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        判断
        if(age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对 需要在(1-120) 给默认年龄18");
            this.age = 18; // 给一个默认年龄
        }

    }

    public double getSalary() {
//        可以这里增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    写一个方法返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + " 薪水" + salary;
    }
}