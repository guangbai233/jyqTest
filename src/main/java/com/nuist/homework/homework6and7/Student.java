package com.nuist.homework.homework6and7;
// 6、演示构造函数重载
public class Student {
    String name;
    int age;
    char gender;

    public Student(){
        System.out.println("无参");
    }

    public Student(String name){
        this.name = name;
        System.out.println("单参");
    }

    public  Student(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("全参");
    }
}
