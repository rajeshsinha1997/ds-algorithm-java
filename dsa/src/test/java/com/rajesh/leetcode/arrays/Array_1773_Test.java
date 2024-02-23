package com.rajesh.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Array_1773_Test {
    // create test object instance
    Array_1773 testObject = new Array_1773();

    @Test
    void test_array_1773() {
        // given test cases
        assertEquals(1, testObject.countMatches(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"), Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")), "color", "silver"));
        assertEquals(2, testObject.countMatches(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"), Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")), "type", "phone"));
    }
}
