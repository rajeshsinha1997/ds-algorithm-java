package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_1313_Test {
    // create test object instance
    Array_1313 testObject = new Array_1313();

    @Test
    void test_array_1313() {
        // given test cases
        assertArrayEquals(new int[] { 2, 4, 4, 4 }, testObject.decompressRLElist(new int[] { 1, 2, 3, 4 }));
        assertArrayEquals(new int[] { 1, 3, 3 }, testObject.decompressRLElist(new int[] { 1, 1, 2, 3 }));
    }

}
