package com.wipro.Day_ten;

public class PatternMatching_three {
	public static void main(String[] args) {
		Object obj3="Java";
		if(obj3 instanceof String x && x.length()>3)
				System.out.println(obj3+" is a Long Word");
		else 
			System.out.println(obj3+ " is a Short word ");
	
	}
}
