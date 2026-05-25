package com.wpiro.Day_six;
import java.util.Scanner;

public class CountVowels {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        
	        CountVowels cv = new CountVowels();
	        int result = cv.countVowels(input);
	        
	        System.out.println("Number of vowels: " + result);
	        sc.close();
	    }
    
    public int countVowels(String str) {
        if (str == null) return 0;
        int count = 0;
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

   
}