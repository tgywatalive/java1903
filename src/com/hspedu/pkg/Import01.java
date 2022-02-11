package com.hspedu.pkg;

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
//        使用系统的Arrays进行数组排序
        int[] arr = {-1, 20, 2, 13, 3};
//        比如对其进行排序
//        传统方法是自己编写排序方法
//        系统提供了相关的类可以方便完成排序
        Arrays.sort(arr);
//        输出排序结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
