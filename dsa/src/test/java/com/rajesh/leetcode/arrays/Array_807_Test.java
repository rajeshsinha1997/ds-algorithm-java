package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_807_Test {
    // create test object instance
    Array_807 testObject = new Array_807();

    @Test
    void test_array_807() {
        // given test cases
        assertEquals(35, testObject.maxIncreaseKeepingSkyline(
                new int[][] { { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } }));
        assertEquals(0, testObject.maxIncreaseKeepingSkyline(
                new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }));
    }

}
