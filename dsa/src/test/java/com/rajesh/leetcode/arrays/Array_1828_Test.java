package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_1828_Test {
    // create test object instance
    Array_1828 testObject = new Array_1828();

    @Test
    void test_array_1828() {
        // given test cases

        // prepare expected data
        int[] expectedData = new int[] { 3, 2, 2 };

        // get actual data
        int[] actualData = testObject.countPoints(new int[][] { { 1, 3 }, { 3, 3 }, { 5, 3 }, { 2, 2 } },
                new int[][] { { 2, 3, 1 }, { 4, 3, 1 }, { 1, 1, 2 } });

        // perform tests
        for (int i = 0; i < expectedData.length; i++) {
            assertEquals(expectedData[i], actualData[i]);
        }

        // prepare expected data
        expectedData = new int[] { 2, 3, 2, 4 };

        // get actual data
        actualData = testObject.countPoints(new int[][] { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 } },
                new int[][] { { 1, 2, 2 }, { 2, 2, 2 }, { 4, 3, 2 }, { 4, 3, 3 } });

        // perform tests
        for (int i = 0; i < expectedData.length; i++) {
            assertEquals(expectedData[i], actualData[i]);
        }
    }
}
