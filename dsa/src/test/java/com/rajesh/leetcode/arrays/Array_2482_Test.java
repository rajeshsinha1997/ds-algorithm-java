package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_2482_Test {
    // create test object instance
    Array_2482 testObject = new Array_2482();

    @Test
    void test_array_2482() {
        // given test cases
        assertArrayEquals(new int[][] { { 0, 0, 4 }, { 0, 0, 4 }, { -2, -2, 2 } },
                testObject.onesMinusZeros(new int[][] { { 0, 1, 1 }, { 1, 0, 1 }, { 0, 0, 1 } }));
        assertArrayEquals(new int[][] { { 5, 5, 5 }, { 5, 5, 5 } },
                testObject.onesMinusZeros(new int[][] { { 1, 1, 1 }, { 1, 1, 1 } }));
    }

}
