package com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        Manager taler = new Manager("taler", 15000, 50000);
        PolyParameter polyParameter = new PolyParameter();

        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(taler);
        polyParameter.showEmpAnnual(milan);

        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee employee) {
        if (employee instanceof Worker) {
            ((Worker) employee).work();
        } else if (employee instanceof Manager) {
            ((Manager) employee).manage();
        } else {
            System.out.println("输入有误请检查...");
        }
    }
}
