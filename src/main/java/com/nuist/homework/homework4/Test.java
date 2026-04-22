package com.nuist.homework.homework4;
// 4、使用2种方式遍历数组并输出到控制台
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // 传统for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // 增强for循环
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }
}
