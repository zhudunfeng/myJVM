package com.atguigu.day02_runtime;

import java.util.Random;

public class RuntimeMemoryDemo {
    public static void main(String[] args) {
//        long maxMemory = Runtime.getRuntime().maxMemory();//返回Java虚拟机试图使用的最大内存量。
//        long totalMemory = Runtime.getRuntime().totalMemory();//返回Java虚拟机中的内存总量
//        System.out.println("TOTAL_MEMORY(-Xms)="+totalMemory+"字节"+(totalMemory/(double)1024/1024)+"MB");
//        System.out.println("MAX_MEMORY(-Xmx)="+maxMemory+"字节"+(maxMemory/(double)1024/1024)+"MB");
        String str = "www.atguigu.com" ;
        while(true)
        {
            str += str + new Random().nextInt(88888888) + new Random().nextInt(999999999) ;
        }


    }
}
