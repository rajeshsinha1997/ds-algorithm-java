// leetcode problem - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
package com.rajesh.leetcode.arrays;

public class Array_1365 {
    /**
     * method to solve the given problem
     * 
     * @param nums - array of positive integers
     * @return an array which contains how many numbers are smaller than the current
     *         number
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // create a frequency array to store frequency of the elements present int the
        // array
        int[] fr = new int[101];

        // create two variables to store the minimum and the maximum value present in
        // the given array
        int minimumValue = Integer.MAX_VALUE;
        int maximumValue = Integer.MIN_VALUE;

        // iterate over the given array
        for (int i : nums) {
            // increment the frequency of the element by 1
            fr[i]++;

            // check if the current number is smaller than the minimum element
            if (minimumValue > i) {
                // update minimum element
                minimumValue = i;
            }

            // check if the current element is greater than maximum value
            if (maximumValue < i) {
                // update the maximum value
                maximumValue = i;
            }
        }

        // create variable to store the count of the numbers smaller than the current
        // number
        int count = 0;

        // iterate over the frequency array from the minimum to the maximum value
        for (int i = minimumValue; i <= maximumValue; i++) {
            // store the frequency of the current element into a temporary variable
            int temp = fr[i];

            // store the number of elements smaller than the current number (value of the
            // count variable at current position) into the frequency array
            fr[i] = count;

            // add the value of the temporary variable to the count variable
            count += temp;
        }

        // iterate over the nums array
        for (int i = 0; i < nums.length; i++) {
            // update the value at current index with the number of elements smaller
            // than the current element
            nums[i] = fr[nums[i]];
        }

        // return the given array as result
        return nums;
    }
}
