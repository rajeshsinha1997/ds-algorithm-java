// leetcode problem - https://leetcode.com/problems/richest-customer-wealth/description/
package com.rajesh.leetcode.arrays;

public class Array_1672 {
    /**
     * method to solve the problem
     * 
     * @param accounts - a mxn grid of integer numbers
     * @return wealth of the richest customer
     */
    public int maximumWealth(int[][] accounts) {
        // create variable to store the maximum wealth
        int maximumWealth = 0;

        // iterate over the given array
        for (int[] account : accounts) {
            // create variable to store the wealth from the current account array
            int wealth = 0;

            // iterate over the account array and add the amount of money from the array to
            // the wealth variable
            for (int money : account) {
                wealth += money;
            }

            // check if the wealth is greater than the maximum wealth
            if (wealth > maximumWealth) {
                // update maximum wealth
                maximumWealth = wealth;
            }
        }

        // return maximum wealth
        return maximumWealth;
    }
}
