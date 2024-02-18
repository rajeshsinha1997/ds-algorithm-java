package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Array_1920_Test {
    // create test object instance
    Array_1920 testObject = new Array_1920();

    @Test
    public void test_array_1920() {
        // given test cases
        assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 3 }, testObject.buildArray(new int[] { 0, 2, 1, 5, 3, 4 }));
        assertArrayEquals(new int[] { 4, 5, 0, 1, 2, 3 }, testObject.buildArray(new int[] { 5, 0, 1, 2, 3, 4 }));

        // custom test cases
        assertArrayEquals(new int[] {}, testObject.buildArray(new int[] {}));
        assertArrayEquals(new int[] { 0 }, testObject.buildArray(new int[] { 0 }));
    }
}
