package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Array_2433_Test {
    // create test object instance
    Array_2433 testObject = new Array_2433();

    @Test
    public void test_array_2433() {
        // given test cases
        assertArrayEquals(new int[] { 5, 7, 2, 3, 2 }, testObject.findArray(new int[] { 5, 2, 0, 3, 1 }));
        assertArrayEquals(new int[] { 13 }, testObject.findArray(new int[] { 13 }));
    }

}
