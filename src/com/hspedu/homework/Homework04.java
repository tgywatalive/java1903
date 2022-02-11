package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("刘备", 100, 20, 1.2);
//        设置奖金
        manager.setBonus(3000);
//        打印经理的工资信息
        manager.salaryPrint();

        Worker worker = new Worker("关羽", 50, 10, 1.0);
        worker.salaryPrint();
    }
}

class Employee {
    private String name;
    private double salary;
    private int day;
    private double grade;

    public Employee() {
    }

    public Employee(String name, double salary, int day, double grade) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void salaryPrint() {
        System.out.println(name + "工资是多少 " + salary * day * grade);
    }
}

class Manager extends Employee {
    //  特有属性奖金
    private double bonus;

    //    创建manager对象时 奖金多少是不确定的
    public Manager(String name, double salary, int day, double grade) {
        super(name, salary, day, grade);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void salaryPrint() {
//        因为经理的工资计算方式和Employee不一样 所以重写
        System.out.println("经理 " + getName() + " 工资是 " + (bonus + getSalary() * getDay() * getGrade()));

    }
}

class Worker extends Employee {
//    分析普通员工没有特有的属性

    public Worker(String name, double salary, int day, double grade) {
        super(name, salary, day, grade);
    }

//    重写输出工资信息


    @Override
    public void salaryPrint() {
        super.salaryPrint();
    }
}
