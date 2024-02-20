// leetcode problem - https://leetcode.com/problems/missing-number/description/
package com.rajesh.leetcode.arrays;

public class Array_268 {
    /**
     * method to solve the given problem
     * 
     * @param nums - array of distinct integers containing integers from [0-n],
     *             where n is the length of the array
     * @return return the only number that is missing from the array
     */
    public int missingNumber(int[] nums) {
        // store the length of the array into a variable
        int n = nums.length;

        // create variable to store the missing number
        int missingNumber = 0;

        // iterate over the array
        for (int i = 1; i <= n; i++) {
            // do xor between the array element at (i-1) and i and store the value into the
            // variable missingNumber after performing xor operation with the value it
            // contains already
            missingNumber ^= (i ^ nums[i - 1]);
        }

        // return the missing number
        return missingNumber;
    }
}
