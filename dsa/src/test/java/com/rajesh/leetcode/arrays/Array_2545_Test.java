package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Array_2545_Test {
    // create test object instance
    Array_2545 testObject = new Array_2545();

    @Test
    void test_array_2545() {
        // given test cases
        assertArrayEquals(new int[][] { { 7, 5, 11, 2 }, { 10, 6, 9, 1 }, { 4, 8, 3, 15 } },
                testObject.sortTheStudents(new int[][] { { 10, 6, 9, 1 }, { 7, 5, 11, 2 }, { 4, 8, 3, 15 } }, 2));
        assertArrayEquals(new int[][] { { 5, 6 }, { 3, 4 } },
                testObject.sortTheStudents(new int[][] { { 3, 4 }, { 5, 6 } }, 0));
    }
}
