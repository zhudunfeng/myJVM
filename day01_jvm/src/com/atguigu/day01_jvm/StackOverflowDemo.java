package com.atguigu.day01_jvm;

public class StackOverflowDemo {
    private static int i=1;

    //递归调用,没有结束条件，会栈溢出
    public static void test(){
        if(i==10){
            return;
        }
        System.out.println(i);
        i++;
        new StackOverflowDemo().test();
    };

    public static void main(String[] args) {
        test();
    }
}
