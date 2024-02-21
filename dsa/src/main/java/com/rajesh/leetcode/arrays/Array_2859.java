// leetcode problem - https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description/
package com.rajesh.leetcode.arrays;

import java.util.List;

public class Array_2859 {
    /**
     * method to count number of set bits in a given integer number
     * 
     * @param num - a positive integer number
     * @return number of set bits in the given integer number
     */
    private int countNumberOfSetBits(int num) {
        // create variable to store number of set bits
        int count = 0;

        // continue until the given number is greater than 0
        while (num > 0) {
            // update the given number value by doing bitwise AND with (num-1)
            // Brian Kernighan's Algorithm
            num &= num - 1;

            // increment count by 1
            count++;
        }

        // return number of set bits in the given number
        return count;
    }

    /**
     * method to solve the given problem
     * 
     * @param nums - 0 indexed list of integers
     * @param k    - an integer value
     * @return sum of integers in nums whose corresponding indices have exactly k
     *         set bits
     */
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        // create a variable to store the sum of the numbers satisfying the given
        // condition
        int sum = 0;

        // iterate over the given list of integers
        for (int i = 0; i < nums.size(); i++) {
            // check if the number of set bits in the index value is equal to k
            if (this.countNumberOfSetBits(i) == k) {
                // add the number at current index with sum
                sum += nums.get(i);
            }
        }

        // return the sum
        return sum;
    }
}
