package com.wpiro.Day_six;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestreverseString {

    @Test
    void testReverseNormal() {
        ReverseString rs = new ReverseString();
        String result = rs.reverseString("apple");
        assertEquals("elppa", result);
    }

    @Test
    void testReverseSingleChar() {
        ReverseString rs = new ReverseString();
        String result = rs.reverseString("A");
        assertEquals("A", result);
    }

    @Test
    void testReverseEmpty() {
        ReverseString rs = new ReverseString();
        String result = rs.reverseString("");
        assertEquals("", result);
    }

    @Test
    void testReverseNull() {
        ReverseString rs = new ReverseString();
        String result = rs.reverseString(null);
        assertEquals(null, result);
    }
}