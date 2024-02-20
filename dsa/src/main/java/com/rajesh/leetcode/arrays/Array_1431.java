// leetcode problem - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
package com.rajesh.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_1431 {
    /**
     * method to solve the given problem
     * 
     * @param candies      - array of positive integers
     * @param extraCandies - integer denoting the number of extra candies
     * @return boolean array result
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // create variable to store the maximum number of candies present in the given
        // array
        int maximumCandy = -1;

        // iterate over the array
        for (int i : candies) {
            // check if the current number of candies is greater than the maximum number of
            // candies
            if (maximumCandy < i) {
                // update number of maximum candies
                maximumCandy = i;
            }
        }

        // create list to store the result
        List<Boolean> result = new ArrayList<>();

        // iterate over the given array
        for (int i : candies) {
            // check if we add extra candies with the current number of candies then if it
            // is greater than or equal to the maximum number of candies available and add
            // the value to the result list
            result.add(i + extraCandies >= maximumCandy);
        }

        // return result list
        return result;
    }
}
