package com.nuist.homework.homework15and16;
// 15and16.演示接口和抽象类的区别

// 6.类只能单继承 接口可以多实现
public class UDisk extends StorageDevices implements TypeC,USB{
    // 子类 U盘 是一种存储设备 具有Typec和USB接口

    // 1.两者都无法实例化
    // 2.两者都可以定义抽象方法

    @Override
    public void disconnectUSB() {
        System.out.println("USB断开");
    }

    @Override
    public void connectUSB() {
        System.out.println("USB连接");
    }

    @Override
    public void disconnectTypeC() {
        System.out.println("TypeC断开");
    }

    @Override
    public void connectTypeC() {
        System.out.println("TypeC连接");
    }

    @Override
    public void storeData() {
        System.out.println("使用压缩方式存储");
    }

     // 5.抽象类和子类之间是 is a的关系 具有较高的耦合度
     // 接口和实现类是 like a 的关系 实现类体现的是 满足 符合规范



}
