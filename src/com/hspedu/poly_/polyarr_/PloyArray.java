package com.hspedu.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 18, 100);
        persons[2] = new Student("smith", 17, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

//        循环遍历多态数组调用say方法
        for (int i = 0; i < persons.length; i++) {
//            编译类型是Person 运行类型按照实际情况来
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student) {
                ((Student) persons[i]).study();
            }else if(persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            } else {
                System.out.println("你的类型有误亲自行检查...");
            }
        }
    }
}
