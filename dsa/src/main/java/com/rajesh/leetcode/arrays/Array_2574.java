// leetcode problem - https://leetcode.com/problems/left-and-right-sum-differences/description/
package com.rajesh.leetcode.arrays;

public class Array_2574 {
    /**
     * method to solve the given problem
     * 
     * @param nums - 0 indexed integer array
     * @return 0 indexed integer array after performing the required operations
     */
    public int[] leftRightDifference(int[] nums) {
        // create an array to store the left and right prefix sum of the elements
        // given in the nums array
        int[] prefixSum = new int[nums.length];

        // create two pointers to point at the first and last index of the given array
        int firstPointer = 0;
        int lastPointer = nums.length - 1;

        // create two variables to store the left and right prefix sums at each step
        int leftPrefixSum = 0;
        int rightPrefixSum = 0;

        // continue until first pointer reaches the last index and the last pointer
        // reaches the first index of the given nums array
        while (firstPointer < nums.length && lastPointer > -1) {
            // check if the index pointed by the first pointer holds the value 0 in the
            // prefix sum array
            if (prefixSum[firstPointer] == 0) {
                // update the value at the corresponding index with the value of left prefix sum
                prefixSum[firstPointer] = leftPrefixSum;
            } else {
                // subtract the value at current index in the prefix sum array from the left
                // prefix sum and update the value at the current index in the prefix sum array
                // with the absolute result value of the subtraction
                prefixSum[firstPointer] = Math.abs(prefixSum[firstPointer] - leftPrefixSum);
            }

            // add the value present in the nums array at the index pointed by the first
            // pointer to the left prefix sum
            leftPrefixSum += nums[firstPointer];

            // check if the index pointed by the last pointer holds the value 0 in the
            // prefix sum array
            if (prefixSum[lastPointer] == 0) {
                // update the value at the corresponding index with the value of right prefix
                // sum
                prefixSum[lastPointer] = rightPrefixSum;
            } else {
                // subtract the value at current index in the prefix sum array from the right
                // prefix sum and update the value at the current index in the prefix sum array
                // with the absolute result value of the subtraction
                prefixSum[lastPointer] = Math.abs(prefixSum[lastPointer] - rightPrefixSum);
            }

            // add the value present in the nums array at the index pointed by the last
            // pointer to the right prefix sum
            rightPrefixSum += nums[lastPointer];

            // increment first pointer by 1
            firstPointer++;

            // decrement last pointer by 1
            lastPointer--;
        }

        // return the prefix sum array
        return prefixSum;
    }
}