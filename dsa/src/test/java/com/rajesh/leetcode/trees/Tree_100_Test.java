package com.rajesh.leetcode.trees;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Tree_100_Test {
    // create test object instance
    Tree_100 testObject = new Tree_100();

    @Test
    void test_tree_100() {
        // given test cases
        assertTrue(
                testObject.isSameTree(new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null)),
                        new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null))));
        assertFalse(testObject.isSameTree(
                new TreeNode(1, new TreeNode(2, null, null), null),
                new TreeNode(1, null, new TreeNode(2, null, null))));
        assertFalse(
                testObject.isSameTree(new TreeNode(1, new TreeNode(2, null, null), new TreeNode(1, null, null)),
                        new TreeNode(1, new TreeNode(1, null, null), new TreeNode(2, null, null))));
    }
}
