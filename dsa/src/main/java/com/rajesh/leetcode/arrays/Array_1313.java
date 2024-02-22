// leetcode problem - https://leetcode.com/problems/decompress-run-length-encoded-list/description/
package com.rajesh.leetcode.arrays;

import java.util.Arrays;

public class Array_1313 {
    /**
     * method to solve the given problem
     * 
     * @param nums - array of integers represents run-length encoding
     * @return the decompressed array of integers
     */
    public int[] decompressRLElist(int[] nums) {
        // create a variable to store the length of the result array
        int lengthOfResultArray = 0;

        // iterate over the given nums array for every alternate index starting from 0
        for (int i = 0; i < nums.length; i += 2) {
            // add the value at the current index to the length of the nums array
            lengthOfResultArray += nums[i];
        }

        // create the result array
        int[] result = new int[lengthOfResultArray];

        // create a variable index and initialize it with 0
        int index = 0;

        // iterate over the nums array once again
        for (int i = 0; i < nums.length; i += 2) {
            // fill the result array from index pointed by the variable index with the value
            // nums[i+1] for nums[i] times
            Arrays.fill(result, index, index + nums[i], nums[i + 1]);

            // update the value of the index variable
            index += nums[i];
        }

        // return result array
        return result;
    }
}
