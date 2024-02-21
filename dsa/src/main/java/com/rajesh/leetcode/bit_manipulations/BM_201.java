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
        // create variable to count the total number of bit shifted
        int totalBitShifted = 0;

        // while the left range limit is not equal to the right range limit
        while (left != right) {
            // right shift both range limits by 1
            left >>= 1;
            right >>= 1;

            // increase total number of shifts by 1
            totalBitShifted++;
        }

        // take any of the range limit and right shift the same number of bits and
        // return that as result
        return left << totalBitShifted;
    }
}

/**
 * To efficiently solve this problem, we need to observe the bitwise AND
 * operation. When we perform bitwise AND on two numbers, the result preserves
 * common bits between the binary representations of the two numbers. If there
 * is any bit position where one of the numbers has a 0, the result will have a
 * 0 at that position.
 * 
 * In the given range [left, right], if we have different bits in any position
 * between left and right, then their AND result in that position will be 0. So,
 * we need to find the common bits between left and right from the most
 * significant bit (MSB) to the least significant bit (LSB).
 * 
 * The approach is as follows:
 * 
 * 1. Find the common prefix (common bits) between left and right by shifting
 * both to the right until they become equal.
 * 
 * 2. Append zeros to the right of the common prefix to reconstruct the result.
 */
