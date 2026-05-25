package com.wpiro.Day_six;
import java.util.Scanner;

public class UpperCaseConverter {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter text to capitalize: ");
	        String input = sc.nextLine();

	        UpperCaseConverter converter = new UpperCaseConverter();
	        String result = converter.toUpper(input);

	        System.out.println("Uppercase: " + result);
	        sc.close();
	    }

    public String toUpper(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }

 
}