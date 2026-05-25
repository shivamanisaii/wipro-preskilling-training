package com.wipro.Day_nine;

public class MethodSyncMain{
    public static void main(String[] args) {
        
        MethodSync account = new MethodSync();

        
        Runnable task = () -> {
            account.withdraw(700);
        };

        
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setName("Avi");
        t2.setName("Shiva");

       
        t1.start();
        t2.start();
    }
}