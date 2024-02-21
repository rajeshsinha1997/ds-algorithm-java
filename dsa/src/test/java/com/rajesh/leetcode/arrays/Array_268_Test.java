package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_268_Test {
    // create test object instance
    Array_268 testObject = new Array_268();

    @Test
    void test_array_268() {
        // given test cases
        assertEquals(2, testObject.missingNumber(new int[] { 3, 0, 1 }));
        assertEquals(2, testObject.missingNumber(new int[] { 0, 1 }));
        assertEquals(8, testObject.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }

}
