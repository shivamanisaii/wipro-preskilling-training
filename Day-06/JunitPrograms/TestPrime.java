package com.wpiro.Day_six;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPrime {

        @Test
        void testPrimeNumber() {
            PrimeChecker pc = new PrimeChecker();
            boolean result = pc.isPrime(7);
            assertEquals(true, result);
        }

        @Test
        void testNonPrimeNumber() {
            PrimeChecker pc = new PrimeChecker();
            boolean result = pc.isPrime(10);
            assertEquals(false, result);
        }

        @Test
        void testOneIsNotPrime() {
            PrimeChecker pc = new PrimeChecker();
            boolean result = pc.isPrime(1);
            assertEquals(false, result);
        }

        @Test
        void testNegativeNumber() {
            PrimeChecker pc = new PrimeChecker();
            boolean result = pc.isPrime(-5);
            assertEquals(false, result);
        }

        @Test
        void testLargePrime() {
            PrimeChecker pc = new PrimeChecker();
            boolean result = pc.isPrime(13);
            assertEquals(true, result);
        }
//        @Test
//        void testZeroPrime() {
//            PrimeChecker pc = new PrimeChecker();
//            boolean result = pc.isPrime(0);
//            assertEquals(true, result);
//        }


}
