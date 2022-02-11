//声明当前类所在的包 放在类的最上面
//一个类中只能有一个package
package com.hspedu.pkg;

//import指令 放package下类上 可以多句且没有顺序要求
import java.util.Arrays;
import java.util.Scanner;

public class PkgDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {0, -1, 1};
        Arrays.sort(arr);
    }
}
