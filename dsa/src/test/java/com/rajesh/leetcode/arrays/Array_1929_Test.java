package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Array_1929_Test {
    // create test object instance
    Array_1929 testObject = new Array_1929();

    @Test
    public void test_array_1929() {
        // given test cases
        assertArrayEquals(new int[] { 1, 2, 1, 1, 2, 1 }, testObject.getConcatenation(new int[] { 1, 2, 1 }));
        assertArrayEquals(new int[] { 1, 3, 2, 1, 1, 3, 2, 1 }, testObject.getConcatenation(new int[] { 1, 3, 2, 1 }));

        // custom test cases
        assertArrayEquals(new int[] {}, testObject.getConcatenation(new int[] {}));
        assertArrayEquals(new int[] { 1, 1 }, testObject.getConcatenation(new int[] { 1 }));
    }

}
