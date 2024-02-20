package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Array_1480_Test {
    // create test object instance
    Array_1480 testObject = new Array_1480();

    @Test
    public void test_array_1480() {
        // given test cases
        assertArrayEquals(new int[] { 1, 3, 6, 10 }, testObject.runningSum(new int[] { 1, 2, 3, 4 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, testObject.runningSum(new int[] { 1, 1, 1, 1, 1 }));
        assertArrayEquals(new int[] { 3, 4, 6, 16, 17 }, testObject.runningSum(new int[] { 3, 1, 2, 10, 1 }));
    }
}
