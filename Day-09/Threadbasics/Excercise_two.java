package com.wipro.Day_nine;

public class Excercise_two {
    public static void main(String[] args) {

        ReverseCount task1 = new ReverseCount();
        ForwardCount task2 = new ForwardCount();


        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}

class ForwardCount implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Forward: " + i);
        }
    }
}

class ReverseCount implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Reverse: " + i);
        }
    }
}