// leetcode problem - https://leetcode.com/problems/concatenation-of-array/description/
package com.rajesh.leetcode.arrays;

public class Array_1929 {
    /**
     * method to solve the given problem
     * 
     * @param nums - array of integers
     * @return concatenated array of integers
     */
    public int[] getConcatenation(int[] nums) {
        // store length of the given array
        int n = nums.length;

        // create result array of length twice of the given array
        int[] ans = new int[2 * n];

        // copy the given array into the result array
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);

        // return result array
        return ans;
    }
}
