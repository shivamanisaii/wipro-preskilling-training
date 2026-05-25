package com.wpiro.Day_six;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestVowels {
    
    @Test
    void testCountVowels() {
        CountVowels su = new CountVowels();
        int result = su.countVowels("education");
        assertEquals(5, result);
    }
}