package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_2574_Test {
    // create test object instance
    Array_2574 testObject = new Array_2574();

    @Test
    void test_array_2574() {
        assertArrayEquals(new int[] { 15, 1, 11, 22 }, testObject.leftRightDifference(new int[] { 10, 4, 8, 3 }));
        assertArrayEquals(new int[] { 0 }, testObject.leftRightDifference(new int[] { 1 }));
    }

}
