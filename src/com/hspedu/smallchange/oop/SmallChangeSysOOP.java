package com.hspedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 该类是完成零钱通各个功能的类
* 使用OOP 面向对象编程
* 将各个功能对应一个方法
* */
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "------零钱通明细------";
    double money = 0;
    double balance = 0;
    Date date = null; // 是 java.util.Date 类型 表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 可用于日期格式化的对象
    String note = "";
    //        先完成显示菜单 并可以选择
    public void mainMenu() {
        do {
            System.out.println("===选择零钱通菜单OOP版===");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择（1-4）：");
            key = scanner.next();

//            使用switch 分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误请重新选择");
            }
        } while (loop);
    }

//    完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

//    完成收益入账
    public void income() {
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
//                    找出不正确的金额条件 然后给出提示即可 就直接break
        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于 0");
            return; // 退出方法 不再执行后面的代码
        }
//                    money的值要校验
        balance += money;
//                    拼接收益入账信息 到 details
        date = new Date(); // 获取当前日期
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

//    消费
    public void pay() {
        System.out.println("消费金额");
        money = scanner.nextDouble();
//                    找出金额不正确的情况
        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额应该在 0-" + balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
//                    拼接消费信息到details
        date = new Date(); // 获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

//    退出
    public void exit() {
        String choice = "";
        while (true) { // 要求用户必须输入y/n 否则一致循环
            System.out.println("你确定要退出吗？ y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
