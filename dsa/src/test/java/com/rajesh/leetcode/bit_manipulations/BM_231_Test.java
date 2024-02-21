package com.rajesh.leetcode.bit_manipulations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BM_231_Test {
    // create test object instance
    BM_231 testObject = new BM_231();

    @Test
    void test_bm_231() {
        // given test cases
        assertTrue(testObject.isPowerOfTwo(1));
        assertTrue(testObject.isPowerOfTwo(16));
        assertFalse(testObject.isPowerOfTwo(3));

        // custom test cases
        assertFalse(testObject.isPowerOfTwo(-1));
        assertFalse(testObject.isPowerOfTwo(-16));
    }
}
