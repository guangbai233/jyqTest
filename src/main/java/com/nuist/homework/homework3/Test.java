package com.nuist.homework.homework3;
// 3、演示数组的动态初始化和静态初始化、并演示它的特性
public class Test {
    public static void main(String[] args) {
        // 动态初始化
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for(int i:a){
            System.out.print(i + " ");
        }

        System.out.println();

        // 静态初始化
        int[] b = new int[]{4,5,6};
        for(int i:b){
            System.out.print(i + " ");
        }
    }
}
