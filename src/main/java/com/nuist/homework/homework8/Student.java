package com.nuist.homework.homework8;
// 8、创建一个类,定义一些属性,
// 在另一个类中使用set/get方法调用属性
public class Student {
    private String name;
    private int age;
    private char gender;

    public Student(){

    }

    public  Student(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void show(){
        System.out.printf("姓名:%s 年龄:%d 性别:%c",name,age,gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
