package com.nuist.homework.homework12;

// 12、演示方法重载并调用
public class ADD {
    public int add(int a, int b) {
        return a + b;
    }

    //参数数量不同
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 参数数据类型不同
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        ADD n = new ADD();
        System.out.println(n.add(1,2));
        System.out.println(n.add(1,2,3));
        System.out.println(n.add(1.1,2.2));
    }

}
