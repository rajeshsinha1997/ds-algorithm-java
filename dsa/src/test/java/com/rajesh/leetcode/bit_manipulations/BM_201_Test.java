package com.rajesh.leetcode.bit_manipulations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BM_201_Test {
    // create test object instance
    BM_201 testObject = new BM_201();

    @Test
    void test_bm_201() {
        // given test cases
        assertEquals(4, testObject.rangeBitwiseAnd(5, 7));
        assertEquals(0, testObject.rangeBitwiseAnd(0, 0));
        assertEquals(0, testObject.rangeBitwiseAnd(1, 2147483647));
        assertEquals(2147483646, testObject.rangeBitwiseAnd(2147483646, 2147483647));
        assertEquals(0, testObject.rangeBitwiseAnd(1, 2));
        assertEquals(1073741824, testObject.rangeBitwiseAnd(1073741824, 2147483647));
        assertEquals(1, testObject.rangeBitwiseAnd(1, 1));

        // custom test cases
        assertEquals(0, testObject.rangeBitwiseAnd(6, 13));
    }

}
