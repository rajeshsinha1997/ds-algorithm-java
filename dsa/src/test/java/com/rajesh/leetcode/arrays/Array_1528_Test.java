package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_1528_Test {
    // create test object instance
    Array_1528 testObject = new Array_1528();

    @Test
    void test_array_1528() {
        // given test cases
        assertEquals("leetcode", testObject.restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1, 3 }));
        assertEquals("abc", testObject.restoreString("abc", new int[] { 0, 1, 2 }));
    }
}
