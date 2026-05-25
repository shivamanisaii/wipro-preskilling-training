package com.wpiro.Day_six;
import java.util.Scanner;
public class ConsonantReplace {
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		Scanner sc= new Scanner(System.in);
		String word=sc.next();
		ConsonantReplace cr = new ConsonantReplace();
		String output=cr.replaceConsonants(word);
		System.out.println("Replace word: "+output);
		
	}	
	public String replaceConsonants(String str) {
	    String result = "";
	    String vowels = "aeiouAEIOU";
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
	            result += '0';
	        } else {
	            result += ch;
	        }
	    }
	    return result;
	}
}
