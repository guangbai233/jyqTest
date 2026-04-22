package com.nuist.homework.homework2;
// 2、演示基本数据类型转换(强制转换、隐式转换)
public class Test {
    public static void main(String[] args) {
        // 强制转换 大转小
        byte a = (byte)1000;
        System.out.println(a);

        // 隐式转换 小转大
        int b = 100;
        double c = b;
        System.out.println(c);
    }
}
