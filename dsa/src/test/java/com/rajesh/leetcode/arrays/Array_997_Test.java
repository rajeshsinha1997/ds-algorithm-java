package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_997_Test {
    // create test object instance
    Array_997 testObject = new Array_997();

    @Test
    void test_array_997() {
        // given test cases
        assertEquals(2, testObject.findJudge(2, new int[][] { { 1, 2 } }));
        assertEquals(3, testObject.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 } }));
        assertEquals(-1, testObject.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 }, { 3, 1 } }));
        assertEquals(-1, testObject.findJudge(3, new int[][] { { 1, 2 }, { 2, 3 } }));
        assertEquals(3, testObject.findJudge(4, new int[][] { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } }));
        assertEquals(1, testObject.findJudge(1, new int[][] {}));
    }

}
