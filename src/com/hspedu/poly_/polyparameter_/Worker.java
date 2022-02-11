package com.hspedu.poly_.polyparameter_;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工 " + getName() + " is working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual(); // 没有额外收入直接调用父类方法
    }
}
