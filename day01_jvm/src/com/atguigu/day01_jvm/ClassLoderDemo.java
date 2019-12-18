package com.atguigu.day01_jvm;


public class ClassLoderDemo {
    public static void main(String[] args) {
        //Thread thread = new Thread();
        //System.out.println(thread.getClass().getClassLoader());//因为Thread的底层实现是native方法

        Object o = new Object();
        System.out.println(o.getClass().getClassLoader());

        System.out.println();
        System.out.println();
        System.out.println();

        //证明jvm双亲委派
        ClassLoderDemo classLoderDemo = new ClassLoderDemo();
        System.out.println(classLoderDemo.getClass().getClassLoader());//AppClassLoder
        System.out.println(classLoderDemo.getClass().getClassLoader().getParent());//ExtClassLoder
        System.out.println(classLoderDemo.getClass().getClassLoader().getParent().getParent());//null(BootStrapClassLoder)


    }
}
