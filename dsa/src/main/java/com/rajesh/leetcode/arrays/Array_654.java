// leetcode problem - https://leetcode.com/problems/maximum-binary-tree/description/
package com.rajesh.leetcode.arrays;

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

public class Array_654 {
    /**
     * method to construct the root node at each step along with it's left and right
     * child node
     * 
     * @param arr           - an array of unique integers
     * @param startingIndex - the starting index of the range from which we have to
     *                      construct the tree
     * @param endingIndex   - the ending index of the range from which we have to
     *                      construct the tree
     * @return the constructed root node along with it's left and right child node
     */
    private TreeNode solve(int[] arr, int startingIndex, int endingIndex) {
        // check if the starting is greater than the ending index
        if (startingIndex > endingIndex) {
            // return null as result
            return null;
        }

        // create a variable to store the maximum value in the given range of the array
        int maxValue = Integer.MIN_VALUE;

        // create a variable to store the index of the maximum value in the given range
        // of the array
        int indexOfTheMaximumValue = -1;

        // iterate over the given range of the array to find the index of the maximum
        // value
        for (int i = startingIndex; i <= endingIndex; i++) {
            if (arr[i] > maxValue) {
                // update the value of the variable holding maximum value
                maxValue = arr[i];

                // update the index of the maximum value
                indexOfTheMaximumValue = i;
            }
        }

        // create the root node with the maximum value along with the left and the right
        // node and return
        return new TreeNode(maxValue, solve(arr, startingIndex, indexOfTheMaximumValue - 1),
                solve(arr, indexOfTheMaximumValue + 1, endingIndex));
    }

    /**
     * method to solve the given problem
     * 
     * @param nums - an array of integers with no duplicates
     * @return the maximum binary tree build from nums
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // call the method responsible to construct the root node and return the result
        return solve(nums, 0, nums.length - 1);
    }
}
