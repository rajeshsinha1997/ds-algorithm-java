package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Array_2011_Test {
    // create test object instance
    Array_2011 testObject = new Array_2011();

    @Test
    public void test_array_2011() {
        // given test cases
        assertEquals(1, testObject.finalValueAfterOperations(new String[] { "--X", "X++", "X++" }));
        assertEquals(3, testObject.finalValueAfterOperations(new String[] { "++X", "++X", "X++" }));

        // custom test cases
        assertEquals(0, testObject.finalValueAfterOperations(new String[] {}));
    }

}
