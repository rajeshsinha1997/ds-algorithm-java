// leetcode problem - https://leetcode.com/problems/sort-the-students-by-their-kth-score/description/
package com.rajesh.leetcode.arrays;

import java.util.Arrays;

public class Array_2545 {
    /**
     * method to solve the given problem
     * 
     * @param score - 0 indexed (mxn) matrix of distinct integers
     * @param k     - a non-negative integer number
     * @return the matrix after sorting it by the kth column
     */
    public int[][] sortTheStudents(int[][] score, int k) {
        // sort the given array by the kth column
        Arrays.sort(score, (a, b) -> b[k] - a[k]);

        // return the given array
        return score;
    }
}
