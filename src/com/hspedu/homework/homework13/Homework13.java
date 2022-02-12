package com.hspedu.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {
//        测试
        Student student = new Student("小明", '男', 15, "00023102");
        student.printInfo(); // 封装
        System.out.println("===================");
        Teacher teacher = new Teacher("张三", '男', 30, "6");
        teacher.printInfo();

//        定义多态
        Person[] persons = new Person[4];
        persons[0] = new Student("jack", '男', 10, "0001");
        persons[1] = new Student("mary", '女', 20, "0002");
        persons[2] = new Teacher("mary", '女', 36, "5");
        persons[3] = new Teacher("scott", '男', 26, "1");

//        创建作业对象
        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        System.out.println("排序后的数组情况");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

//        遍历输出 调用Test方法
        System.out.println("================");
        for (int i = 0; i < persons.length; i++) { // 遍历多态数组
            homework13.test(persons[i]);
        }

    }

//    方法 完成年龄从高到底排序
    public void bubbleSort(Person[] persons) {
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
//                判断条件 根据需要变化
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }

            }
        }
    }

    public void test(Person p) {
        if (p instanceof Student) { //p 的运行类型是Student
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("什么都不做");
        }
    }

}
