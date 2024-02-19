// leetcode problem - https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description/
package com.rajesh.leetcode.arrays;

import java.util.Arrays;

public class Array_1637 {
    /**
     * method to solve the problem
     * 
     * @param points - 2D array of positive integers where each pair of integers
     *               indicates a point on a 2D plane
     * @return the widest vertical area between two points when there no other point
     *         is inside that area
     */
    public int maxWidthOfVerticalArea(int[][] points) {
        // store the length of the given array
        int n = points.length;

        // check if there is only two points given in the array
        if (n == 2) {
            // return vertical area between those two points
            return Math.abs(points[0][0] - points[1][0]);
        }

        // create an array of integers to store the x co-ordinates of the points
        int[] xCoOrdinates = new int[n];

        // iterate over the given array of points and add the x co-ordinate values into
        // the integer array
        for (int i = 0; i < n; i++) {
            xCoOrdinates[i] = points[i][0];
        }

        // sort the array of x co-ordinate values
        Arrays.sort(xCoOrdinates);

        // create variable to store the maximum vertical area
        int maximumVerticalArea = 0;

        // iterate over the integer array of x co-ordinates
        for (int i = 1; i < n; i++) {
            // check if current and previous x co-ordinate values are not same
            if (xCoOrdinates[i] != xCoOrdinates[i - 1]) {
                // calculate distance between each of the x co-ordinates
                int verticalDistance = xCoOrdinates[i] - xCoOrdinates[i - 1];

                // check if the vertical distance is greater than the maximum vertical area
                if (verticalDistance > maximumVerticalArea) {
                    // update maximum vertical area
                    maximumVerticalArea = verticalDistance;
                }
            }
        }

        // return maximum vertical area
        return maximumVerticalArea;

    }
}
