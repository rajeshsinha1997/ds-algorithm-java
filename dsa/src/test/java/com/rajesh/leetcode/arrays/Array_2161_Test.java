package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_2161_Test {
    // create test object instance
    Array_2161 testObject = new Array_2161();

    @Test
    void test_array_2161() {
        // given test cases
        assertArrayEquals(new int[] { 9, 5, 3, 10, 10, 12,
                14 }, testObject.pivotArray(new int[] { 9, 12, 5, 10, 14, 3, 10 }, 10));
        assertArrayEquals(new int[] { -3, 2, 4, 3 }, testObject.pivotArray(new int[] { -3, 4, 3, 2 }, 2));
    }
}
