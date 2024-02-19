// leetcode problem - https://leetcode.com/problems/power-of-two/description/
package com.rajesh.leetcode.bit_manipulations;

public class BM_231 {
    /**
     * method to solve the given problem
     * 
     * @param n - an integer in the range of [-2^31, 2^31-1]
     * @return true if n is power of 2, false otherwise
     */
    public boolean isPowerOfTwo(int n) {
        // if given integer number is negative then return false
        if (n < 0)
            return false;

        // variable to store number of set bits in the given integer number
        int count = 0;

        // count number of set bits in the given integer number
        while (n > 0) {
            // Brian Kernighan's Algorithm
            n &= n - 1;
            count++;
        }

        // return true if there is only 1 set bit in the given integer number, false
        // otherwise
        return count == 1;
    }
}
