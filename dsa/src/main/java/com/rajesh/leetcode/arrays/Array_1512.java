// leetcode problem - https://leetcode.com/problems/number-of-good-pairs/description/
package com.rajesh.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class Array_1512 {
    /**
     * method to solve the given problem
     * 
     * @param nums - array of integers
     * @return number of good pairs
     */
    public int numIdenticalPairs(int[] nums) {
        // store length of the given array
        int n = nums.length;

        // create map to store frequency of the elements present inside the given array
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // iterate over the given array and store frequency of the elements
        for (int i = 0; i < n; i++) {
            // check if element is already added into the frequency map
            if (!frequencyMap.containsKey(nums[i])) {
                // add element to the frequency map
                frequencyMap.put(nums[i], 1);
            } else {
                // increase frequency of the element
                frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
            }
        }

        // create variable to store the count of the good pairs
        int countOfGoodPairs = 0;

        // check frequency of each element and calculate number of good pairs can be
        // formed
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            // get frequency of the element
            int value = entry.getValue();

            // calculate how many pairs can be formed using that element and add the same to
            // the count
            countOfGoodPairs += value * (value - 1) / 2;
        }

        // return count of good pairs
        return countOfGoodPairs;
    }
}
