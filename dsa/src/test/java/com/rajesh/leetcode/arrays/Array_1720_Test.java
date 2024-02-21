package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_1720_Test {
    // create test object instance
    Array_1720 testObject = new Array_1720();

    @Test
    void test_array_1720() {
        // given test cases
        assertArrayEquals(new int[] { 1, 0, 2, 1 }, testObject.decode(new int[] { 1, 2, 3 }, 1));
        assertArrayEquals(new int[] { 4, 2, 0, 7, 4 }, testObject.decode(new int[] { 6, 2, 7, 3 }, 4));
    }

}
