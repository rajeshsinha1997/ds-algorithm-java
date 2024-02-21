package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Array_2114_Test {
    // create test object instance
    Array_2114 testObject = new Array_2114();

    @Test
    void test_array_2114() {
        // given test cases
        assertEquals(6, testObject.mostWordsFound(
                new String[] { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }));
        assertEquals(3, testObject.mostWordsFound(
                new String[] { "please wait", "continue to fight", "continue to win" }));
    }
}
