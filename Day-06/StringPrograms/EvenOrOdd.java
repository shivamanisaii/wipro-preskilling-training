package com.wpiro.Day_six;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		EvenOrOdd obj=new EvenOrOdd();
		String result =obj.CheckEvenOdd(num);
		System.out.println(result);
		
		
	}
	
	public String CheckEvenOdd(int num) {
		if (num%2==0) {
			return "Even";
		}
		else 
		return "Odd";
	}
}
