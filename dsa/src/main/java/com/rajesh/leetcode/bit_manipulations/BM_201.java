// leetcode problem - https://leetcode.com/problems/bitwise-and-of-numbers-range/description/
// video explanation - https://www.youtube.com/watch?v=3XYQLHSoew8
package com.rajesh.leetcode.bit_manipulations;

public class BM_201 {
    /**
     * method to solve the given problem
     * 
     * @param left  - integer number indicating left bound (inclusive)
     * @param right - integer number indicating right bound (inclusive)
     * @return bitwise AND of all numbers from left to right
     */
    public int rangeBitwiseAnd(int left, int right) {
        // execute while the right range limit is greater than the left range limit
        while (right > left) {
            // update the right range limit doing bitwise AND operation of right with
            // (right-1) and store the value back into the right range limit
            // Brian Kernighan's Algorithm
            right &= right - 1;
        }

        // return the value of the right range limit as the result
        return right;
    }
}
