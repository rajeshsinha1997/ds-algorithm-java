// leetcode problem - https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/
package com.rajesh.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_2610 {
    /**
     * method to solve the given problem
     * 
     * @param nums - array of integers
     * @return 2D array created from nums satisfying the given conditions
     */
    public List<List<Integer>> findMatrix(int[] nums) {
        // create frequency array to store the frequency of the elements present inside
        // the array nums
        int[] frequencyArray = new int[201];

        // create result list
        List<List<Integer>> result = new ArrayList<>();

        // iterate over the given array of integers
        for (int i : nums) {
            // use the current frequency of the current element as the index and check if
            // the result list do not contains any list at that index
            if (result.size() <= frequencyArray[i]) {
                // add a new list to the result list
                result.add(new ArrayList<>());
            }

            // add the current element to the list present at the mentioned index in the
            // result list
            result.get(frequencyArray[i]).add(i);

            // increase frequency of the element by 1 in the frequency array
            frequencyArray[i]++;
        }

        // return result list
        return result;
    }
}
