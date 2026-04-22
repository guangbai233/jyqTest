package com.nuist.homework.homework13and14;
// 13、演示方法重写并调用
public class Student extends Person{
    int sno;// 学号

    public Student(){

    }

    public void eat(){
        System.out.println(name+"在食堂吃东西");
    }

}
