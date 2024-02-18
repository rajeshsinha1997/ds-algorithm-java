package com.rajesh.leetcode.arrays;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class Array_2942_Test {
    // create test object instance
    Array_2942 testObject = new Array_2942();

    @Test
    public void test_array_2942() {
        // given test cases
        assertEquals(List.of(0, 1), testObject.findWordsContaining(new String[] { "leet", "code" }, 'e'));
        assertEquals(List.of(0, 2), testObject.findWordsContaining(new String[] { "abc", "bcd", "aaaa", "cbc" }, 'a'));
        assertEquals(List.of(), testObject.findWordsContaining(new String[] { "abc", "bcd", "aaaa", "cbc" }, 'z'));
    }

}
