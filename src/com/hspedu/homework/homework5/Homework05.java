package com.hspedu.homework.homework5;

public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 10000);
        jack.setSalMonth(15);
        jack.printSal();

        Peasant smith = new Peasant("smith", 20000);
        smith.printSal();
    }
}

class Employee {
    //    属性
    private String name;
    private double sal;
    private int salMonth = 12;
//    方法


    public Employee() {
    }

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

//    打印全年工资
    public void printSal() {
        System.out.println(name + " 年工资是：" + (sal * salMonth));
    }
}