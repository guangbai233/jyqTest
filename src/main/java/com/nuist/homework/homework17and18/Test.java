package com.nuist.homework.homework17and18;

// 18、演示instanceof的用法
public class Test {
    public static void main(String[] args) {
        Person p = new Student();
        p.name = "张三";
        p.eat();
        // 父类对象使用子类方法需要向下转型
        // 使用instanceof进行判断
        if (p instanceof Student) {
            Student s = (Student)p;
            s.study();
        }

    }

}
