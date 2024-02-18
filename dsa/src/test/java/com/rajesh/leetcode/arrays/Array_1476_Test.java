package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Array_1476_Test {
    @Test
    public void test_array_1476() {
        // given test case - 1
        Array_1476 testObject = new Array_1476(new int[][] { { 1, 2, 1 }, { 4, 3, 4 }, { 3, 2, 1 }, { 1, 1, 1 } });

        assertEquals(1, testObject.getValue(0, 2));

        testObject.updateSubrectangle(0, 0, 3, 2, 5);

        assertEquals(5, testObject.getValue(0, 2));
        assertEquals(5, testObject.getValue(3, 1));

        testObject.updateSubrectangle(3, 0, 3, 2, 10);

        assertEquals(10, testObject.getValue(3, 1));
        assertEquals(5, testObject.getValue(0, 2));

        // given test case - 2
        testObject = new Array_1476(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } });

        assertEquals(1, testObject.getValue(0, 0));

        testObject.updateSubrectangle(0, 0, 2, 2, 100);

        assertEquals(100, testObject.getValue(0, 0));
        assertEquals(100, testObject.getValue(2, 2));

        testObject.updateSubrectangle(1, 1, 2, 2, 20);

        assertEquals(20, testObject.getValue(2, 2));
    }

}
