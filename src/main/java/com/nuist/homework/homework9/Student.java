package com.nuist.homework.homework9;
// 9、演示this关键字的用法
public class Student {
    String name;
    int age;
    char gender;

    public Student(){

    }

    // 在构造方法中调用成员变量
    public  Student(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void show(){
        System.out.printf("姓名:%s 年龄:%d 性别:%c",name,age,gender);
    }

    // 在当前类的方法中调用当前类的其他方法
    public void study(){
        this.show();
        System.out.println("在学习");
    }
}
