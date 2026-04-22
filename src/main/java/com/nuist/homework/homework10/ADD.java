package com.nuist.homework.homework10;
//10、创建一个类,定义一个求和的方法,并调用
public class ADD {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ADD a = new ADD();
        int result = a.add(1,2);
        System.out.println(result);
    }
}
