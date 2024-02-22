package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_2974_Test {
    // create test object instance
    Array_2974 testObject = new Array_2974();

    @Test
    void test_array_2974() {
        // given test cases
        assertArrayEquals(new int[] { 3, 2, 5, 4 }, testObject.numberGame(new int[] { 5, 4, 2, 3 }));
        assertArrayEquals(new int[] { 5, 2 }, testObject.numberGame(new int[] { 2, 5 }));
    }

}
