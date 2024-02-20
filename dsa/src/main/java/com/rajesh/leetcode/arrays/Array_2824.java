// leetcode problem - https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
package com.rajesh.leetcode.arrays;

import java.util.Collections;
import java.util.List;

public class Array_2824 {
    /**
     * method to solve the given problem
     * 
     * @param nums   - list of integers
     * @param target - an integer
     * @return number of pairs whose sum is less than the target
     */
    public int countPairs(List<Integer> nums, int target) {
        // store the number of integers present in the list
        int n = nums.size();

        // create variable to store the count of the pairs
        int count = 0;

        // sort the given list of integers
        Collections.sort(nums);

        // create two pointers to point at the first and last index of the list of
        // integers
        int leftPointer = 0;
        int rightPointer = n - 1;

        // while left pointer value is less than right pointer value
        while (leftPointer < rightPointer) {
            // check if integers pointed by left and right pointer produce a sum which is
            // less than the target value
            if (nums.get(leftPointer) + nums.get(rightPointer) < target) {
                // add total number of elements present between left and right pointer to the
                // count variable
                count += rightPointer - leftPointer;

                // move left pointer to 1 index to the right
                leftPointer++;
            } else {
                // move right pointer 1 index to the left
                rightPointer--;
            }
        }

        // return count of pairs
        return count;
    }
}
