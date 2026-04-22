package com.nuist.homework.homework19;

public class Test {
    public static void main(String[] args) {
        // 运行时异常
        // 编译不报错，运行时崩溃
        int i = 0;
        try {
            System.out.println(1 / i);
        } catch (ArithmeticException e) {
            System.out.println("发生运行时异常: 除数不能为0!");
        }

        // 检查异常
        // 编译阶段必须处理，否则代码无法运行
        try{
            test1();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
    public static void test1() throws Exception{
        test2();
    }
    public static void test2() throws Exception{

    }



}
