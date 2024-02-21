package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_2798_Test {
    // create test object instance
    Array_2798 testObject = new Array_2798();

    @Test
    void test_array_2798() {
        // given test cases
        assertEquals(3, testObject.numberOfEmployeesWhoMetTarget(new int[] { 0, 1, 2, 3, 4 }, 2));
        assertEquals(0, testObject.numberOfEmployeesWhoMetTarget(new int[] { 5, 1, 4, 2, 2 }, 6));
    }

}
