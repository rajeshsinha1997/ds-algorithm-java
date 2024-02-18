// leetcode problem - https://leetcode.com/problems/shuffle-the-array/description/
package com.rajesh.leetcode.arrays;

public class Array_1470 {
    /**
     * method to solve the problem
     * 
     * @param nums - array of integers
     * @param n    - half of the length of the given array
     * @return an array in required form of length as the same given array
     */
    public int[] shuffle(int[] nums, int n) {
        // create result array of same length as the given array
        int[] ans = new int[2 * n];

        // create pointer variable to iterate over first n values
        int pointer = 0;

        // create index variable to keep track of where to place the element in the
        // formatted array
        int index = 0;

        // iterate over the first n elements and add them into the formatted array
        while (pointer < n) {
            ans[index] = nums[pointer++];
            index += 2;
        }

        // reset index variable to fill the remaining places
        index = 1;

        // iterate over the next set of n elements and add them into the formatted array
        while (pointer < 2 * n) {
            ans[index] = nums[pointer++];
            index += 2;
        }

        // return result array
        return ans;
    }
}
