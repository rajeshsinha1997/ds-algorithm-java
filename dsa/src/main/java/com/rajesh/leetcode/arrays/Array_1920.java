// leetcode problem - https://leetcode.com/problems/build-array-from-permutation/description/
package com.rajesh.leetcode.arrays;

public class Array_1920 {
    /**
     * method to solve the given problem
     * 
     * @param nums - 0 based permutation (array of distinct integers)
     * @return array of same length after performing the required operation
     */
    public int[] buildArray(int[] nums) {
        // store length of the given array
        int n = nums.length;

        // create result array
        int[] ans = new int[n];

        // populate the result array according to the mentioned rule
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        // return result array
        return ans;
    }
}
