package com.wipro.Day_nine;

public class Excercise_one {
    public static void main(String[] args) {
        RCount t1 = new RCount();
        t1.start();
        Fcount t2 = new Fcount();
        t2.start();
    }
}
class Fcount extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class RCount extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}




