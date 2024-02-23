package com.rajesh.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Array_654_Test {
    // create test object instance
    Array_654 testObject = new Array_654();

    @Test
    void test_array_654() {
        // given test cases

        // prepare expected data
        TreeNode expectedData = new TreeNode(6, new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1))),
                new TreeNode(5, new TreeNode(0), null));
        // perform test
        assertThat(expectedData).usingRecursiveComparison().isEqualTo(
                testObject.constructMaximumBinaryTree(new int[] { 3, 2, 1, 6, 0, 5 }));

        // prepare expected data
        expectedData = new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1)));
        // perform test
        assertThat(expectedData).usingRecursiveComparison().isEqualTo(
                testObject.constructMaximumBinaryTree(new int[] { 3, 2, 1 }));
    }

}
