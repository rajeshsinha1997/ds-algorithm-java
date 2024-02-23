package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_1769_Test {
    // create test object instance
    Array_1769 testObject = new Array_1769();

    @Test
    void test_array_1769() {
        // given test cases
        assertArrayEquals(new int[] { 1, 1, 3 }, testObject.minOperations("110"));
        assertArrayEquals(new int[] { 11, 8, 5, 4, 3, 4 }, testObject.minOperations("001011"));
    }
}
