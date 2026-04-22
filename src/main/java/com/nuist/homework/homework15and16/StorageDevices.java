package com.nuist.homework.homework15and16;

public abstract class StorageDevices {
    // 抽象类 存储设备
    // 3.抽象类中可以定义非抽象方法 成员变量 和构造方法
    public int capacity;
    public String systemVersion;

    public abstract void storeData();

    public void showCapacity(){
        System.out.println("存储容量为:" + capacity);
    }
}
