package com.nuist.homework.homework17and18;
// 17、演示super的用法
public class Student extends Person{
    int sno;// 学号

    public Student(){
        // 在子类的构造方法中访问父类的构造方法
        super();
    }

    public void study(){
        // 在子类中访问父类的成员变量
        System.out.println(super.name+"在学习");
    }

    public void eatAndSleep(){
        // 在子类的成员方法中调用父类的成员方法
        super.eat();
        System.out.println("吃饱了睡觉");
    }
}
