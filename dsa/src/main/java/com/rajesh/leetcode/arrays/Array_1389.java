// leetcode problem - https://leetcode.com/problems/create-target-array-in-the-given-order/description/
package com.rajesh.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_1389 {
    /**
     * method to solve the given problem
     * 
     * @param nums  - array of integers
     * @param index - array of integers
     * @return target array created following the given rules
     */
    public int[] createTargetArray(int[] nums, int[] index) {
        // create a result list to store the elements as per the order required
        List<Integer> result = new ArrayList<>();

        // iterate over the index array
        for (int i = 0; i < index.length; i++) {
            // add the value from array nums to the result list at a index from the array
            // index
            result.add(index[i], nums[i]);
        }

        // copy all the elements from the result list to the array nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result.get(i);
        }

        // return the array nums
        return nums;
    }
}
