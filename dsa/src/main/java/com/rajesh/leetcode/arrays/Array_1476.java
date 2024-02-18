// leetcode problem - https://leetcode.com/problems/subrectangle-queries/description/
package com.rajesh.leetcode.arrays;

public class Array_1476 {
    // create instance variable to store the data of the rectangle
    private int[][] rectangle;

    /**
     * constructor
     * 
     * @param rectangle - row x col rectangle as a matrix of integers
     */
    public Array_1476(int[][] rectangle) {
        // initialize instance variable
        this.rectangle = rectangle;
    }

    /**
     * method to update all values with newValue in the sub-rectangle whose upper
     * left corner is (row1, col1), and bottom right corner is (row2, col2)
     * 
     * @param row1     - row value of the top left corner
     * @param col1     - column value of the top left corner
     * @param row2     - row value of the bottom right corner
     * @param col2     - column value of the bottom right corner
     * @param newValue - existing value will be updated with this integer value
     */
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        // iterate over the cor-ordinates bounded by the given edges
        for (int r = row1; r <= row2; r++) {
            for (int c = col1; c <= col2; c++) {
                // update existing value with the given new value
                this.rectangle[r][c] = newValue;
            }
        }
    }

    /**
     * method to return the current value of the co-ordinates (row, col) from the
     * rectangle
     * 
     * @param row - row value of the required co-ordinate
     * @param col - column value of the required co-ordinate
     * @return value present at the mentioned co-ordinate
     */
    public int getValue(int row, int col) {
        // return value present the the given co-ordinate
        return this.rectangle[row][col];
    }
}
