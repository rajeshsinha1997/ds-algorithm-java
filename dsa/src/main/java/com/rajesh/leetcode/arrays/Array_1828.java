// https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/description/
package com.rajesh.leetcode.arrays;

import java.util.Arrays;

public class Array_1828 {
    /**
     * method to solve the given problem
     * 
     * @param points  - a 2D array of integers where each pair indicating a point on
     *                a 2D plane
     * @param queries - a 2D array of integers where each entry indicating a query
     * @return an array of integers where each integer is the count of how many
     *         points are inside the corresponding circle for the corresponding
     *         query
     */
    public int[] countPoints(int[][] points, int[][] queries) {
        // create an array to store the result of each query
        int[] ans = new int[queries.length];

        // parallel fill the answer array
        Arrays.parallelSetAll(ans, index -> {
            // store the values given in the query
            int xq = queries[index][0];
            int yq = queries[index][1];
            int radiusSquare = queries[index][2] * queries[index][2];

            // iterate over the array of points
            for (int[] p : points) {
                // store the co-ordinate of the given point
                int x = p[0];
                int y = p[1];

                // calculate the euclidean distance between the point given in the query and the
                // current point
                int euclideanDistanceSquare = ((xq - x) * (xq - x) + (yq - y) * (yq - y));

                // check if the euclidean distance is less than or equal to the radius value
                // given in the query
                if (euclideanDistanceSquare <= radiusSquare) {
                    // increment the result for the current query by 1
                    ans[index]++;
                }
            }

            // return the number of points that are inside or on the circle
            return ans[index];
        });

        // return the answer array
        return ans;
    }
}
