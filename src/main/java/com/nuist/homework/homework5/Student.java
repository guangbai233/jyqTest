package com.nuist.homework.homework5;
// 5、创建一个类,定义一些属性,定义一个show方法,
// 在show方法,通过调用show方法显式属性的值
public class Student {
    String name;
    int age;
    char gender;

    public void show(){
        System.out.printf("姓名:%s 年龄:%d 性别:%c",name,age,gender);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.gender = '男';
        s.show();
    }
}
