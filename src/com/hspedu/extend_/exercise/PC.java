package com.hspedu.extend_.exercise;

public class PC extends Computer{
    private String brand;
//这里idea 根据继承规则自动把调用给弄好了
//    这里也体现出继承设计的基本思想 父类构造器完成父类初始化 子类完成子类初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC信息=");
//        调用父类的details方法得到父类相关信息
        System.out.println(getDetails() + " brand=" + brand);
    }
}
