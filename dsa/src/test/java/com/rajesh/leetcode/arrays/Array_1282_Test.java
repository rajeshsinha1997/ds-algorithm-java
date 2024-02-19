package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Array_1282_Test {
    // create test object instance
    Array_1282 testObject = new Array_1282();

    @Test
    public void test_array_1282() {
        // given test cases

        // prepare expected data
        List<List<Integer>> expectedData = Arrays.asList(
                Arrays.asList(5),
                Arrays.asList(0, 1, 2),
                Arrays.asList(3, 4, 6));

        // get actual data
        List<List<Integer>> actualData = testObject.groupThePeople(new int[] { 3, 3, 3, 3, 3, 1, 3 });

        // perform test
        assertTrue(actualData.size() == expectedData.size() && actualData.containsAll(expectedData)
                && expectedData.containsAll(actualData));

        // prepare expected data
        expectedData = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(0, 5),
                Arrays.asList(2, 3, 4));

        // get actual data
        actualData = testObject.groupThePeople(new int[] { 2, 1, 3, 3, 3, 2 });

        // perform test
        assertTrue(actualData.size() == expectedData.size() && actualData.containsAll(expectedData)
                && expectedData.containsAll(actualData));
    }

}
