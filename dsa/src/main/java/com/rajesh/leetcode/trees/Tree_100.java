// leetcode problem - https://leetcode.com/problems/same-tree/description/
package com.rajesh.leetcode.trees;

/**
 * structure of the class TreeNode
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Tree_100 {
    /**
     * method to compare two given tree nodes
     * 
     * @param firstNode  - first tree node
     * @param secondNode - second tree node
     * @return true if the two given nodes are equal, false otherwise
     */
    private boolean solve(TreeNode firstNode, TreeNode secondNode) {
        // check if the given first node is null
        if (firstNode == null) {
            // return true if the second node is also null, false otherwise
            return secondNode == null;
        }
        // else check if the second node is null
        if (secondNode == null) {
            // return true if the first node is null, false otherwise
            return firstNode == null;
        }
        // else return true if the value of the given two nodes are same and also their
        // left and right child trees are equal, false otherwise
        return firstNode.val == secondNode.val && solve(firstNode.left, secondNode.left)
                && solve(firstNode.right, secondNode.right);
    }

    /**
     * method to solve the given problem
     * 
     * @param p - root node of the first tree
     * @param q - root node of the second tree
     * @return true if the two trees are equal, false otherwise
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // call the solve method by passing the given two nodes
        return solve(p, q);
    }
}
