// leetcode problem - https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/
package com.rajesh.leetcode.arrays;

public class Array_807 {

    /**
     * method to solve the given problem
     * 
     * @param grid - 0 indexed (nxn) integer matrix
     * @return the maximum total sum that the height of the buildings can be
     *         increased by without changing the city's skyline from any cardinal
     *         direction
     */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        // create a 2D array to store the maximum values from each row and column
        int[][] maxRowColumnValues = new int[2][grid.length];

        // iterate over the given grid
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid.length; c++) {
                // compare the current value with the available maximum value for the
                // corresponding row and update if required
                maxRowColumnValues[0][r] = Math.max(maxRowColumnValues[0][r], grid[r][c]);

                // compare the current value with the available maximum value for the
                // corresponding column and update if required
                maxRowColumnValues[1][c] = Math.max(maxRowColumnValues[1][c], grid[r][c]);
            }
        }

        // create variable to store the total amount of height increased
        int totalHeightIncreased = 0;

        // iterate over the given grid
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid.length; c++) {
                // get the minimum value among the maximum values for the current row and
                // current column, and add the difference between that value and the height of
                // the building at current index to the total variable
                totalHeightIncreased += Math.min(maxRowColumnValues[0][r], maxRowColumnValues[1][c]) - grid[r][c];
            }
        }

        // return the total height that has to be increased
        return totalHeightIncreased;
    }
}
