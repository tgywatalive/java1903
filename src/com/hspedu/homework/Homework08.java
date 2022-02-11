package com.hspedu.homework;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);
//        checkingAccount.withdraw(9);
//        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
    }
}

class BankAccount {
    private double balance; // 余额

    public BankAccount() {
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //    存款
    public void deposit(double amount) {
        balance += amount;
    }

    //    取款
    public void withdraw(double amount) {
        balance -= amount;
    }
//    set和getBalance方法

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

//要求
class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
//        判断是否还可以免手续费
        super.deposit(amount - 1); // 巧妙的使用父类的 deposit方法
//        1块钱用银行的账号
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
//        1块钱转入银行账号
    }
}

class SavingsAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01; // 利率

    public void earnMonthlyInterest() { // 每月初 我们统计上个月的利息 同时将count = 3
        count = 3;
        super.deposit(getBalance() * rate);
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1); // 1块转入银行账号
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1); // 1块转入银行账号
        }
        count--;
    }

    public SavingsAccount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}