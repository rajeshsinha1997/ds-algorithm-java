package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class Array_2824_Test {
    // create test object instance
    Array_2824 testObject = new Array_2824();

    @Test
    public void test_array_2824() {
        // given test cases
        assertEquals(3, testObject.countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2));
        assertEquals(10, testObject.countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2));
    }

}
