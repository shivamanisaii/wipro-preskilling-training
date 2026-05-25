package com.wipro.Day_ten;

public class PatternMatching_two {
	public static void main(String[] args) {
		Object obj="Example Two using if";
		if(obj instanceof String x) 
			System.out.println("String: "+x+ "\nThe Length of the String is : "+x.length());
		else if (obj instanceof Integer num)
			System.out.println("integer: "+ num);
		else 
			System.out.println("Invalid Type");
				
	}
}
