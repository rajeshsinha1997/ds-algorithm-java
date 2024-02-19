package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Array_1672_Test {
    // create test object instance
    Array_1672 testObject = new Array_1672();

    @Test
    public void test_array_1672() {
        // given test cases
        assertEquals(6, testObject.maximumWealth(new int[][] { { 1, 2, 3 }, { 3, 2, 1 } }));
        assertEquals(10, testObject.maximumWealth(new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } }));
        assertEquals(17, testObject.maximumWealth(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }));
    }

}
