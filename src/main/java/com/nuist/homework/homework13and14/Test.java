package com.nuist.homework.homework13and14;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "张三";
        p.eat();

        Student s = new Student();
        s.name = "李四";
        s.eat(); // 子类调用重写后的eat方法

        // 14、演示运行时多态
        Person p1 = new Student(); // 父类引用指向子类对象
        p1.name = "王五";
        p1.eat();
    }
}
