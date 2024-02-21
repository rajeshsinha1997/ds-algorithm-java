package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_1365_Test {
    // create test object instance
    Array_1365 testObject = new Array_1365();

    @Test
    void test_array_1365() {
        // given test cases
        assertArrayEquals(new int[] { 4, 0, 1, 1, 3 },
                testObject.smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 }));
        assertArrayEquals(new int[] { 2, 1, 0, 3 },
                testObject.smallerNumbersThanCurrent(new int[] { 6, 5, 4, 8 }));
        assertArrayEquals(new int[] { 0, 0, 0, 0 },
                testObject.smallerNumbersThanCurrent(new int[] { 7, 7, 7, 7 }));
    }
}
