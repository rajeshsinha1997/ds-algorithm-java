package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Array_1431_Test {
    // create test object instance
    Array_1431 testObject = new Array_1431();

    @Test
    public void test_array_1431() {
        // given test cases

        // prepare expected data
        List<Boolean> expectedData = Arrays.asList(true, true, true, false, true);

        // get actual data
        List<Boolean> actualData = testObject.kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3);

        // perform test
        assertTrue(expectedData.size() == actualData.size() && expectedData.containsAll(actualData)
                && actualData.containsAll(expectedData));

        // prepare expected data
        expectedData = Arrays.asList(true, false, false, false, false);

        // get actual data
        actualData = testObject.kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1);

        // perform test
        assertTrue(expectedData.size() == actualData.size() && expectedData.containsAll(actualData)
                && actualData.containsAll(expectedData));

        // prepare expected data
        expectedData = Arrays.asList(true, false, true);

        // get actual data
        actualData = testObject.kidsWithCandies(new int[] { 12, 1, 12 }, 10);

        // perform test
        assertTrue(expectedData.size() == actualData.size() && expectedData.containsAll(actualData)
                && actualData.containsAll(expectedData));
    }

}
