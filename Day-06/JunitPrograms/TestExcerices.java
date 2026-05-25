package com.wpiro.Day_six;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestExcerices {

    @Test
    void testValidPalindrome() {
        Palindrome p = new Palindrome();
        boolean result = p.isPalindrome("madam");
        assertEquals(true, result);
    }

    @Test
    void testInvalidPalindrome() {
        Palindrome p = new Palindrome();
        boolean result = p.isPalindrome("java");
        assertEquals(false, result);
    }

    @Test
    void testPalindromeWithSpaces() {
        Palindrome p = new Palindrome();
        boolean result = p.isPalindrome("race car");
        assertEquals(true, result);
    }

    @Test
    void testUppercase() {
        Palindrome p = new Palindrome();
        boolean result = p.isPalindrome("Nitin");
        assertEquals(true, result);
    }

}
    ///2nd Question

    
    
    
    
    
    
    
    
    