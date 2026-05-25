package com.wpiro.Day_six;
import java.util.Scanner;


public class ConsonantCounter {
	   public int countConsonants(String str) {
	       if (str == null) return 0;
	       int count = 0;
	       String s = str.toLowerCase();
	       for (int i = 0; i < s.length(); i++) {
	           char ch = s.charAt(i);
	           if (ch >= 'a' && ch <= 'z') {
	                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
	                   count++;
	               }
	           }
	       }
	       return count;
	   }

	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter a string: ");
	       String input = sc.nextLine();

	       ConsonantCounter cc = new ConsonantCounter();
	        int result = cc.countConsonants(input);

	       System.out.println("No. of consonants: " + result);
	        sc.close();
	   }
}


