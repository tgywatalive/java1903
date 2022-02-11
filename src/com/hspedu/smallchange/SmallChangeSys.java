package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
//        化繁为简
//        1.先完成显示菜单 并可以选择菜单 给出对应提示
//        2.完成零钱通明细
//        3.收益入账
//        4.消费
//        5.退出
//        6.
//        定义相关的变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "------零钱通明细------";
        double money = 0;
        double balance = 0;
        Date date = null; // 是 java.util.Date 类型 表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 可用于日期格式化的对象
        String note = "";
        do {
            System.out.println("===零钱通菜单===");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择（1-4）：");
            key = scanner.next();

//            使用switch 分支控制
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
//                    找出不正确的金额条件 然后给出提示即可 就直接break
                    if (money <= 0) {
                        System.out.println("收益入账金额 需要 大于 0");
                        break;
                    }
//                    money的值要校验
                    balance += money;
//                    拼接收益入账信息 到 details
                    date = new Date(); // 获取当前日期
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额");
                    money = scanner.nextDouble();
//                    找出金额不正确的情况
                    if (money <= 0 || money > balance) {
                        System.out.println("你的消费金额应该在 0-" + balance);
                        break;
                    }
                    System.out.println("消费说明：");
                    note = scanner.next();
                    balance -= money;
//                    拼接消费信息到details
                    date = new Date(); // 获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
//                    System.out.println("4 退出");
//                    （1）定义一个choice 接收用户的输入
//                    （2）使用while + break的组合 来处理接收到的输入是y或者n
//                    （3）退出while后 再判断choice是y还是n 就可以决定是否退出

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
                    break;
                default:
                    System.out.println("选择有误请重新选择");
            }
        } while (loop);

        System.out.println("退出了零钱通项目~");
    }
}
