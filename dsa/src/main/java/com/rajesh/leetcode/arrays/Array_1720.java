// leetcode problem - https://leetcode.com/problems/decode-xored-array/description/
package com.rajesh.leetcode.arrays;

public class Array_1720 {
    /**
     * method to solve the given problem
     * 
     * @param encoded - an array of integers
     * @param first   - an integer, which is also the first element of the result
     *                array
     * @return the original array
     */
    public int[] decode(int[] encoded, int first) {
        // create the answer array of length n+1, where n is the length of the encoded
        // array
        int[] ans = new int[encoded.length + 1];

        // add the first element into the answer array
        ans[0] = first;

        // iterate over the encoded array
        for (int i = 0; i < encoded.length; i++) {
            // fill the answer array by performing xor
            ans[i + 1] = (ans[i] ^ encoded[i]);
        }

        // return the answer array
        return ans;
    }
}
