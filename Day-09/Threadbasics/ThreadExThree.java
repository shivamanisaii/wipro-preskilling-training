package com.wipro.Day_nine;
import java.util.Scanner;
public class ThreadExThree {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc =new  Scanner(System.in);
		int nom=sc.nextInt();
		Cubeofanumber cube =new Cubeofanumber(nom);
		Thread t1= new Thread(cube);
		t1.start();
		
	}
}
class Cubeofanumber implements Runnable{
	int x;
	public Cubeofanumber(int x) {
		this.x=x;
	}
	
	public void run() {
		System.out.println("The cube of the given number is : "+ x*x*x);
	}
}