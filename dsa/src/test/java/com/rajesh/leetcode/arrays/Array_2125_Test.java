package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_2125_Test {
    // create test object instance
    Array_2125 testObject = new Array_2125();

    @Test
    void test_array_2125() {
        // given test cases
        assertEquals(8, testObject.numberOfBeams(new String[] { "011001", "000000", "010100", "001000" }));
        assertEquals(0, testObject.numberOfBeams(new String[] { "000", "111", "000" }));
    }
}
