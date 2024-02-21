package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_1637_Test {
    // create test object instance
    Array_1637 testObject = new Array_1637();

    @Test
    void test_array_1637() {
        // given test cases
        assertEquals(1, testObject.maxWidthOfVerticalArea(new int[][] { { 8, 7 }, { 9, 9 }, { 7, 4 }, { 9, 7 } }));
        assertEquals(3, testObject
                .maxWidthOfVerticalArea(new int[][] { { 3, 1 }, { 9, 0 }, { 1, 0 }, { 1, 4 }, { 5, 3 }, { 8, 8 } }));
    }
}
