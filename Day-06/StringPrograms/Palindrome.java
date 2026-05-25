package com.wpiro.Day_six;

public class Palindrome {
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        String cleanStr = str.replace(" ", "").toLowerCase();
        
        String reversed = "";
        for (int i = cleanStr.length() - 1; i >= 0; i--) {
            reversed = reversed + cleanStr.charAt(i);
        }
        
        return cleanStr.equals(reversed);
    }
}
