package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Array_977_Test {
    // create test object instance
    Array_977 testObject = new Array_977();

    @Test
    void test_array_977() {
        // given test cases
        assertArrayEquals(new int[] { 0, 1, 9, 16, 100 }, testObject.sortedSquares(new int[] { -4, -1, 0, 3, 10 }));
        assertArrayEquals(new int[] { 4, 9, 9, 49, 121 }, testObject.sortedSquares(new int[] { -7, -3, 2, 3, 11 }));
    }
}
