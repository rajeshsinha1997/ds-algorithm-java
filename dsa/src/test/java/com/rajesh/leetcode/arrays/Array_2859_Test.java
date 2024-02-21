package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Array_2859_Test {
    // create test object instance
    Array_2859 testObject = new Array_2859();

    @Test
    void test_array_2859() {
        // given test cases
        assertEquals(13, testObject.sumIndicesWithKSetBits(Arrays.asList(5, 10, 1, 5, 2), 1));
        assertEquals(1, testObject.sumIndicesWithKSetBits(Arrays.asList(4, 3, 2, 1), 2));
    }

}
