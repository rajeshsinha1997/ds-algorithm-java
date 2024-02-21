package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Array_2610_Test {
    // create test object instance
    Array_2610 testObject = new Array_2610();

    @Test
    void test_array_2610() {
        // given test cases

        // prepare expected data
        List<List<Integer>> expectedData = Arrays.asList(
                Arrays.asList(1, 3, 4, 2),
                Arrays.asList(1, 3),
                Arrays.asList(1));

        // get actual data
        List<List<Integer>> actualData = testObject.findMatrix(new int[] { 1, 3, 4, 1, 2, 3, 1 });

        // perform test
        assertTrue(actualData.size() == expectedData.size() && actualData.containsAll(expectedData)
                && expectedData.containsAll(actualData));

        // prepare expected data
        expectedData = Arrays.asList(Arrays.asList(1, 2, 3, 4));

        // get actual data
        actualData = testObject.findMatrix(new int[] { 1, 2, 3, 4 });

        // perform test
        assertTrue(actualData.size() == expectedData.size() && actualData.containsAll(expectedData)
                && expectedData.containsAll(actualData));
    }
}
