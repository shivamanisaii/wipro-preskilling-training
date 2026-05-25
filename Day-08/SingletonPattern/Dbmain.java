package com.wipro.Day_eight;

public class Dbmain {
    static Dbconnection obj;

    public static void main(String[] args) {
        obj = Dbconnection.getConnection();
        System.out.println("Connection established: " + obj);

        Dbmain myApp = new Dbmain();
        myApp.fetchuser(); 
    }

    void fetchuser() {
        System.out.println("Fetching user.");
    }
}