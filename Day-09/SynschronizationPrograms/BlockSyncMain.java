package com.wipro.Day_nine;

public class BlockSyncMain {
    public static void main(String[] args) {
        
        BlockSync centralCounter = new BlockSync();

        
        Runnable task = () -> {
            centralCounter.bookTicket(3);
        };


        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.setName("User-1");
        t2.setName("User-2");
        t3.setName("User-3");


        t1.start();
        t2.start();
        t3.start();
    }
}