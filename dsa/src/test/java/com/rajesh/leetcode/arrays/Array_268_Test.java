package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Array_268_Test {
    // create test object instance
    Array_268 testObject = new Array_268();

    @Test
    public void test_array_268() {
        // given test cases
        assertEquals(2, testObject.missingNumber(new int[] { 3, 0, 1 }));
        assertEquals(2, testObject.missingNumber(new int[] { 0, 1 }));
        assertEquals(8, testObject.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }

}
