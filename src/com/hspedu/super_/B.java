package com.hspedu.super_;

public class B extends A{
    public int n1 = 888;

//    编写方法测试
    public void test() {
        System.out.println("super.n1 = " + super.n1); // 100
        super.cal();
    }

//    不能访问父类的private属性 不能访问n4
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }
//    不能访问父类的私有方法
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
//        不能访问test400
    }
//    访问父类构造器
    public B() {
//        super();
//        super("jack");
        super("jack", 10);
    }

    public void cal(){
        System.out.println("B类的cal()方法");
    }

    public void sum() {
        System.out.println("B类的sum方法");
/*//        希望调用父类A的cal方法
//        方法一 直接调用cal() 顺寻是：先在子类本类中找cal()然后在上级父类依次查找... 没有找到则报错提示方法不存在
        cal();
//        方法二 this.cal() < = > cal() 与方法一一致
        this.cal();
//        方法三 不会找本类 直接找父类
        super.cal();*/
//        调用父类的属性
//        n1和this.n1查找和之前的方法一致
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }
}
