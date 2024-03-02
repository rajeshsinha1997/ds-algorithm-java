// leetcode problem - https://leetcode.com/problems/squares-of-a-sorted-array/description/
package com.rajesh.leetcode.arrays;

public class Array_977 {
    /**
     * method to solve the given problem
     * 
     * @param nums - array of integers sorted in non-decreasing order
     * @return an array of the squares of each number sorted in non-decreasing order
     */
    public int[] sortedSquares(int[] nums) {
        // create result array of same length as given array nums
        int[] ans = new int[nums.length];

        // create two pointers to point at the first and the last index of the given
        // array
        int firstPointer = 0;
        int lastPointer = nums.length - 1;

        // create an index to point at the last index of the result array
        int index = ans.length - 1;

        // continue till the first pointer is lesser than or equals to the last pointer
        while (firstPointer <= lastPointer) {
            // check if the absolute value of the value pointed by the first pointer is
            // greater than the last pointer
            if (Math.abs(nums[firstPointer]) > Math.abs(nums[lastPointer])) {
                // store the square of the value pointed by the first pointer at the index
                // pointed by the index variable in the result array
                ans[index] = nums[firstPointer] * nums[firstPointer];

                // increment first pointer by 1
                firstPointer++;
            } else {
                // store the square of the value pointed by the last pointer at the index
                // pointed by the index variable in the result array
                ans[index] = nums[lastPointer] * nums[lastPointer];

                // decrement last pointer by 1
                lastPointer--;
            }

            // decrement the index variable by 1
            index--;
        }

        // return the result array
        return ans;
    }
}
