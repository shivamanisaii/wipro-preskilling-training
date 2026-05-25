package com.wpiro.Day_six;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestMaxOfArray {


    @Test
    void test() {
        ArrayEx nu = new ArrayEx();
        int[] nums = {1, 8, 3, 9, 2};
        int result = nu.MaxOfArray(nums);
        assertEquals(9, result);
    }
}