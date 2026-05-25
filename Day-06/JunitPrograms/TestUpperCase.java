package com.wpiro.Day_six;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestUpperCase {

    @Test
    void testToUpperCase() {
        UpperCaseConverter ucc = new UpperCaseConverter();
        String result = ucc.toUpper("hello world");
        assertEquals("HELLO WORLD", result);
    }

    @Test
    void testMixedCase() {
        UpperCaseConverter ucc = new UpperCaseConverter();
        String result = ucc.toUpper("JaVa");
        assertEquals("JAVA", result);
    }

    @Test
    void testWithNumbers() {
        UpperCaseConverter ucc = new UpperCaseConverter();
        String result = ucc.toUpper("ABCD1234");
        assertEquals("ABCD1234", result);
    }
}