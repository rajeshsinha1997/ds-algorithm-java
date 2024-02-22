package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_1389_Test {
    // create test object instance
    Array_1389 testObject = new Array_1389();

    @Test
    void test_array_1389() {
        // given test cases
        assertArrayEquals(new int[] { 0, 4, 1, 3,
                2 }, testObject.createTargetArray(new int[] { 0, 1, 2, 3, 4 }, new int[] { 0, 1, 2, 2, 1 }));
        assertArrayEquals(new int[] { 0, 1, 2, 3,
                4 }, testObject.createTargetArray(new int[] { 1, 2, 3, 4, 0 }, new int[] { 0, 1, 2, 3, 0 }));
        assertArrayEquals(new int[] { 1, 2, 4, 1 },
                testObject.createTargetArray(new int[] { 4, 2, 1, 1 }, new int[] { 0, 0, 2, 0 }));
        assertArrayEquals(new int[] { 2, 2, 4, 4,
                3 }, testObject.createTargetArray(new int[] { 4, 2, 4, 3, 2 }, new int[] { 0, 0, 1, 3, 1 }));
    }
}
