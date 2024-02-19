// leetcode problem - https://leetcode.com/problems/number-of-employees-who-met-the-target/description/
package com.rajesh.leetcode.arrays;

public class Array_2798 {
    /**
     * method to solve the problem
     * 
     * @param hours  - 0 indexed array of non-negative integers of length n
     * @param target - non-negative integer denoting minimum works each employee
     *               must work
     * @return number of employees who have worked for at least target hours
     */
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        // create variable to store count of employees who have worked at least for
        // target hours
        int count = 0;

        // iterate through the array of total hours worked by each of the employees
        for (int hoursWorked : hours) {
            // check if the current employee has worked for more than the target hours
            if (hoursWorked >= target) {
                // increase count by 1
                count++;
            }
        }

        // return number of employees who have worked at least for target hours
        return count;
    }
}
