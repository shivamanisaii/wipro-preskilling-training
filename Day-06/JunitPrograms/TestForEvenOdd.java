package com.wpiro.Day_six;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestForEvenOdd {

    @Test
    void testEven() {
    	EvenOrOdd eo = new EvenOrOdd();
    	String res =eo.CheckEvenOdd(10);
    	assertEquals("Even", res);
    	
    	
    }
    @Test
    void testOdd() {
    	EvenOrOdd eo= new EvenOrOdd();
    	String res =eo.CheckEvenOdd(7);
    	assertEquals("Odd", res);
    }
  
}
