package com.nuist.homework.homework11;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三"; // 子类调用父类的成员变量
        s.eat(); // 子类调用父类方法
        s.study();
        System.out.println(s.name);
    }
}
