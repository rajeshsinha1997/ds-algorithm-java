// leetcode problem - https://leetcode.com/problems/minimum-number-game/description/
package com.rajesh.leetcode.arrays;

import java.util.Arrays;

public class Array_2974 {
    /**
     * method to solve the given problem
     * 
     * @param nums - 0 indexed integer array of even length
     * @return the result array after performing the required operations
     */
    public int[] numberGame(int[] nums) {
        // sort the given array
        Arrays.sort(nums);

        // iterate over the given array nums
        for (int i = 0; i < nums.length; i += 2) {
            // for every pair of consecutive elements swap the elements in the pair with
            // themselves
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

        // return the given array
        return nums;
    }
}
