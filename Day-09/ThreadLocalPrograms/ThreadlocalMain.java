package com.wipro.Day_nine;

public class ThreadlocalMain{
   
    static ThreadLocal<Integer> local = new ThreadLocal<Integer>();

    public static void main(String[] args) {

        Thread obj = new Thread(() -> {
            local.set(23);
            System.out.println("Thread 1 Local Value: "+ local.get());
        });

        obj.start();

        Thread obj2 = new Thread(() -> {
            local.set(46);
            System.out.println("Thread 2 Local Value: " + local.get());
        });

        obj2.start();
    }
}