// leetcode problem - https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/description/
package com.rajesh.leetcode.arrays;

public class Array_2482 {
    /**
     * method to solve the given problem
     * 
     * @param grid - 0 indexed binary matrix of length (mxn)
     * @return the difference matrix
     */
    public int[][] onesMinusZeros(int[][] grid) {
        // create a 2D array to store the difference in total number of zeros and ones
        // in each row and column
        int[][] differenceCounter = new int[2][];
        differenceCounter[0] = new int[grid.length];
        differenceCounter[1] = new int[grid[0].length];

        // iterate over the given array grid
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                // check if the value at the current index is 1
                if (grid[r][c] == 1) {
                    // increment the count in the counter array for the corresponding row and column
                    differenceCounter[0][r]++;
                    differenceCounter[1][c]++;
                }
                // else decrement the count in the counter array for the corresponding row and
                // column
                else {
                    differenceCounter[0][r]--;
                    differenceCounter[1][c]--;
                }
            }
        }

        // iterate over the given grid array
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                // update value at each index by adding up the difference values from the
                // counter array for the corresponding row and column
                grid[r][c] = differenceCounter[0][r] + differenceCounter[1][c];
            }
        }

        // return the given array grid
        return grid;
    }
}
