package com.nuist.homework.homework6and7;
// 7、创建一个类,定义一些属性,使用构造函数重载进行属性初始化
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.gender = '男';

        Student s2 = new Student("李四");

        Student s3 = new Student("王五",18,'男');
    }
}
