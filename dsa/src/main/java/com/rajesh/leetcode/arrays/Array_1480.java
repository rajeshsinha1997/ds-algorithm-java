// leetcode problem - https://leetcode.com/problems/running-sum-of-1d-array/description/
package com.rajesh.leetcode.arrays;

public class Array_1480 {
    /**
     * method to solve the given problem
     * 
     * @param nums - array of integers
     * @return running sum of the array
     */
    public int[] runningSum(int[] nums) {
        // iterate over the array starting from index 1 up to the last index
        for (int i = 1; i < nums.length; i++) {
            // add the integer present at the previous index (i-1) with the integer present
            // at the current index (i) and store it into the same location, i.e. at the
            // current index
            nums[i] += nums[i - 1];
        }

        // return the given array
        return nums;
    }
}
