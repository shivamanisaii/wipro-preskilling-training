package com.wipro.Day_nine;

public class InterThread {

    public static void main(String[] args) {
        Shared s = new Shared();

        Thread o1 = new Thread(() -> {
            try {
                s.waitForSignal();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread o2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                s.sendSignal();
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        o1.start();
        o2.start();
    }
}

class Shared {
    boolean ready = false;

    synchronized void waitForSignal() throws InterruptedException {
        if (!ready) {
            System.out.println("Thread is in Waiting state");
            wait();
        }
        System.out.println("working??");
        System.out.println("thread is resumed");
    }

    synchronized void sendSignal() {
        ready = true;
        System.out.println("thread is resuming!");
        notify();
    }
}