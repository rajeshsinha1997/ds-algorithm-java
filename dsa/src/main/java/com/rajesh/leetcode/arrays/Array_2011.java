// leetcode problem - https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
package com.rajesh.leetcode.arrays;

public class Array_2011 {
    /**
     * method to solve the problem
     * 
     * @param operations - array of strings containing list of operations
     * @return final integer value after performing all the operations
     */
    public int finalValueAfterOperations(String[] operations) {
        // create variable x with initial value as 0
        int x = 0;

        // iterate over the given array of operations and perform each of the operation
        for (String operation : operations) {
            // check if it is an increment operation then increment value of x by 1
            if (operation.charAt(1) == '+')
                x++;
            // else decrement value of x by 1
            else
                x--;
        }

        // return final value of variable x
        return x;
    }
}
