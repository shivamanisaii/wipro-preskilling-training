package com.wipro.Day_nine;

public class NotifyAllThreads {

    public static void main(String[] args) {
        SharedtoAll s = new SharedtoAll();

        Thread o1 = new Thread(() -> {
            try {
                s.waitForSignal();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread o2 = new Thread(() -> {
            try {
                s.waitForSignal();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread o3 = new Thread(() -> {
            try {
            	
                Thread.sleep(2000);
                s.sendSignalToAll();
            } catch (Exception e) {
                System.out.println(e);
            }
        });
        
        Thread o4 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                s.sendSignalToAll();
            } catch (Exception e) {
                System.out.println(e);
            }
        });
        
        Thread o5 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                s.sendSignalToAll();
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        o1.setName("Thread-1");
        o2.setName("Thread-2");
        o3.setName("Thread-3");
        o4.setName("Thread-4");
        o5.setName("Thread-5");

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}

class SharedtoAll {
    boolean ready = false;

    synchronized void waitForSignal() throws InterruptedException {
        if (!ready) {
            System.out.println(Thread.currentThread().getName() + " is going to wait");
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " has resumed and is working");
    }

    synchronized void sendSignalToAll() {
        ready = true;
        System.out.println("Broadcasting notification to ALL waiting threads");
        notifyAll(); 
    }
}