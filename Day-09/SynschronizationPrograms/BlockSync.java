package com.wipro.Day_nine;

class BlockSync {
    private int availableTickets = 5;

    public void bookTicket(int demand) {
        System.out.println(Thread.currentThread().getName() + " is checking tickets..."); 

        synchronized(this) {
            if (availableTickets >= demand) {
                availableTickets -= demand;
                System.out.println("Tickets booked for " + Thread.currentThread().getName());
            } else {
                System.out.println("Sold out for " + Thread.currentThread().getName());
            }
        }
    }
}