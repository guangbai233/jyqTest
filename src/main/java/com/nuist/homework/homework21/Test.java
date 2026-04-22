package com.nuist.homework.homework21;
// 21、演示String的常用方法15个
public class Test {
    public static void main(String[] args) {
        String str = "  hello world hello earth   ";
        // 1.trim() 去除首尾空格
        String s = str.trim();
        System.out.println(s);

        // 2.charAt() 获取指定索引字符
        System.out.println(s.charAt(0));

        // 3.toUpperCase() 小写转为大写
        System.out.println(s.toUpperCase());

        // 4.toLowerCase() 大写转小写
        System.out.println("ABC".toLowerCase());

        // 5.equals() 比较字符串是否相等
        System.out.println("abc".equals("abc"));

        // 6.equalsIgnoreCase() 忽略大小写比较字符串是否相等
        System.out.println("ABC".equalsIgnoreCase("abc"));

        // 7.replace() 替换字符
        System.out.println(s.replace('h','a'));

        // 8.replaceAll() 替换字符串
        System.out.println(s.replaceAll("hello","hi"));

        // 9.replaceFirst() 替换第一次出现的字符串
        System.out.println(s.replaceFirst("hello","hi"));

        // 10.contains() 判断是否包含指定字符串
        System.out.println(s.contains("hello"));

        // 11.concat() 拼接字符串
        System.out.println("abc".concat("edf"));

        // 12.indexOf() 查找字符串串第一次出现的位置的索引
        System.out.println(s.indexOf("hello"));

        // 13.lastIndexOf() 查找字符串串最后一次出现的位置的索引
        System.out.println(s.lastIndexOf("hello"));

        // 14.startWith() 判断是否以...开头
        System.out.println(s.startsWith("hello"));

        // 15.endWith() 判断是否以...结尾
        System.out.println(s.endsWith("earth"));






    }
}
