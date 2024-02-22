package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_2391_Test {
    // create test object instance
    Array_2391 testObject = new Array_2391();

    @Test
    void test_array_2391() {
        // given test cases
        assertEquals(21, testObject.garbageCollection(new String[] { "G", "P", "GP", "GG" }, new int[] { 2, 4, 3 }));
        assertEquals(37, testObject.garbageCollection(new String[] { "MMM", "PGM", "GP" }, new int[] { 3, 10 }));
    }
}
