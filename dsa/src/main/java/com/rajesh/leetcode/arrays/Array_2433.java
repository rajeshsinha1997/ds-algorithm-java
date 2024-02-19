// leetcode problem - https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/
package com.rajesh.leetcode.arrays;

public class Array_2433 {
    /**
     * method to solve the given problem
     * 
     * @param pref - array of integers
     * @return an array of the same size that satisfies the required condition
     */
    public int[] findArray(int[] pref) {
        // iterate over the given array and deduce the original element
        for (int i = pref.length - 1; i > 0; i--) {
            // deduce the original element using XOR
            pref[i] = pref[i] ^ pref[i - 1];
        }

        // return the given array
        return pref;
    }
}
