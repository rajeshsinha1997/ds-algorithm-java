// leetcode problem - https://leetcode.com/problems/find-the-town-judge/description/
package com.rajesh.leetcode.arrays;

public class Array_997 {
    /**
     * method to solve the given problem
     * 
     * @param n     - number of people in the town
     * @param trust - 2D array of integers
     * @return the label of the town judge if exists, else -1
     */
    public int findJudge(int n, int[][] trust) {
        // create a trust frequency array of length n+1
        int[] trustFrequency = new int[n + 1];

        // iterate over the given trust array
        for (int[] t : trust) {
            // use the first element of each record from trust array as index, and update
            // the value at that particular index in the trust frequency array with -1
            trustFrequency[t[0]] = -1;

            // use the second element of each record from trust array as index, and check if
            // the value at that particular index in the trust frequency array is not -1
            if (trustFrequency[t[1]] != -1) {
                // increment the corresponding value by 1
                trustFrequency[t[1]]++;
            }
        }

        // iterate over the trust frequency array from range [1, n]
        for (int i = 1; i <= n; i++) {
            // check if the value at current index in the trust frequency array is equals to
            // n-1
            if (trustFrequency[i] == n - 1) {
                // return the current index as result
                return i;
            }
        }

        // return -1 as result
        return -1;
    }
}
