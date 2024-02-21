package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_1470_Test {
    // create test object instance
    Array_1470 testObject = new Array_1470();

    @Test
    void test_array_1470() {
        // given test cases
        assertArrayEquals(new int[] { 2, 3, 5, 4, 1, 7 }, testObject.shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3));
        assertArrayEquals(new int[] { 1, 4, 2, 3, 3, 2, 4, 1 },
                testObject.shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4));
        assertArrayEquals(new int[] { 1, 2, 1, 2 }, testObject.shuffle(new int[] { 1, 1, 2, 2 }, 2));
    }

}
