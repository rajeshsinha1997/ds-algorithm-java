// leetcode problem - https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
package com.rajesh.leetcode.arrays;

public class Array_2161 {
    /**
     * method to solve the given problem
     * 
     * @param nums  - a 0 indexed integer array
     * @param pivot - an integer number which is equal to an element of nums
     * @return nums after the rearrangement
     */
    public int[] pivotArray(int[] nums, int pivot) {
        // create an array answer of the same length as nums
        int[] ans = new int[nums.length];

        // create two pointer variables to point at the first and last index of the
        // array answer
        int firstPointer = 0;
        int lastPointer = ans.length - 1;

        // iterate over the nums array
        for (int i = 0; i < nums.length; i++) {
            // check if the item pointed by i is less than the pivot element
            if (nums[i] < pivot) {
                // insert the item into the answer array at index pointed by the first pointer
                ans[firstPointer++] = nums[i];
            }

            // check if the item pointed by -i is greater than the pivot element
            if (nums[nums.length - i - 1] > pivot) {
                // insert the item into the answer array at index pointed by the last pointer
                ans[lastPointer--] = nums[nums.length - i - 1];
            }
        }

        // fill the remaining indices of the answer array with the pivot element
        while (firstPointer <= lastPointer) {
            ans[firstPointer++] = pivot;
            ans[lastPointer--] = pivot;
        }

        // return the answer array
        return ans;
    }
}
