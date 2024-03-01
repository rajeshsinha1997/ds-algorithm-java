package com.rajesh.leetcode.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class String_2864_Test {
    // create test object instance
    String_2864 testObject = new String_2864();

    @Test
    void test_string_2864() {
        // given test cases
        assertEquals("001", testObject.maximumOddBinaryNumber("010"));
        assertEquals("1001", testObject.maximumOddBinaryNumber("0101"));
    }
}
