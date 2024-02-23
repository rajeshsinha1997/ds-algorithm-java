package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Array_1662_Test {
    // create test object instance
    Array_1662 testObject = new Array_1662();

    @Test
    void test_array_1662() {
        // given test cases
        assertTrue(testObject.arrayStringsAreEqual(new String[] { "ab", "c" }, new String[] { "a", "bc" }));
        assertFalse(testObject.arrayStringsAreEqual(new String[] { "a", "cb" }, new String[] { "ab", "c" }));
        assertTrue(testObject.arrayStringsAreEqual(new String[] { "abc", "d", "defg" }, new String[] { "abcddefg" }));
    }

}
