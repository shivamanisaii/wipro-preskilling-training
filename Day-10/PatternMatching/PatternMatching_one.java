package com.wipro.Day_ten;

public class PatternMatching_one {

	public static void main(String[] args) {
		Object obj ="Pattern Matching";
		if (obj instanceof String x) { 
		    
		    System.out.println("String Length is "+x.length()); 
		    
		   
		    
		 Object obj2 = "Hello Wipro"; 

	        
	     if (obj2 instanceof String) { 
	            
	         String y = (String) obj; //old mehtod
	            
	         System.out.println("String length is " + y.length()); 
		    
		}
	}
}
}
