package com.nuist.homework.homework20;
// 20、演示String和StringBuffer StringBuilder的区别
public class Test {
    public static void main(String[] args) {
        // StringBuilder 不保证线程安全 效率稍高一些 长度可变
        // StringBuffer 保证线程安全 效率较低 长度可变
        // String 拼接效率远远远低于前两者 长度不可变

        String s = new String("abc");
        s.concat("123");
        System.out.println(s); // 结果仍是abc,因为String长度不可变

        StringBuilder sb = new StringBuilder("abc");
        sb.append("123");
        System.out.println(sb); // 输出abc123

        StringBuffer sbf = new StringBuffer("abc");
        sbf.append("123");
        System.out.println(sbf); // 输出abc123
    }
}
