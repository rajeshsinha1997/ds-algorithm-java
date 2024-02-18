package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Array_1512_Test {
    // create test object instance
    Array_1512 testObject = new Array_1512();

    @Test
    public void test_array_1512() {
        // given test cases
        assertEquals(4, testObject.numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }));
        assertEquals(6, testObject.numIdenticalPairs(new int[] { 1, 1, 1, 1 }));

        // custom test cases
        assertEquals(0, testObject.numIdenticalPairs(new int[] {}));
        assertEquals(0, testObject.numIdenticalPairs(new int[] { 1 }));
        assertEquals(1, testObject.numIdenticalPairs(new int[] { 1, 1 }));
    }

}
