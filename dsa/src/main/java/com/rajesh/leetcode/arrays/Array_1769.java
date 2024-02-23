// leetcode problem - https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/
package com.rajesh.leetcode.arrays;

public class Array_1769 {
    /**
     * method to solve the given problem
     * 
     * @param boxes - a string literal describing the contents of the boxes
     * @return an array of integers where answer[i] is the minimum number of
     *         operations needed to move all the balls to the ith box
     */
    public int[] minOperations(String boxes) {
        // create an array answer of the same length as the given string
        int[] ans = new int[boxes.length()];

        // create two different pointers to point at the first and last position of the
        // given string
        int firstPointer = 0;
        int lastPointer = boxes.length() - 1;

        // create two variables to store the last number of movement to bring all balls
        // to the box at the previous index from the left and from thr right side
        int lastMovementFromLeft = 0;
        int lastMovementFromRight = 0;

        // create two count variables to count the number of balls collected so far
        // while iterating from both left and right side
        int countOfBallsFromLeft = 0;
        int countOfBallsFromRight = 0;

        // continue until first pointer reaches at the last index and last pointer
        // reaches at the first index
        while (firstPointer < boxes.length() && lastPointer > -1) {
            // update the value at indices pointed by the first and the last pointer in the
            // answer array by adding the value of the last movement from left and right
            // respectively
            ans[firstPointer] += lastMovementFromLeft;
            ans[lastPointer] += lastMovementFromRight;

            // check if we have a ball at the index pointed by the first pointer
            if (boxes.charAt(firstPointer) == '1') {
                // increment the count of balls from left side by 1
                countOfBallsFromLeft++;
            }

            // check if we have a ball at the index pointed by the last pointer
            if (boxes.charAt(lastPointer) == '1') {
                // increment the count of balls from right side by 1
                countOfBallsFromRight++;
            }

            // add the number of balls collected from left to the number of total movement
            // from left
            lastMovementFromLeft += countOfBallsFromLeft;

            // add the number of balls collected from right to the number of total movement
            // from right
            lastMovementFromRight += countOfBallsFromRight;

            // increment first pointer by 1 and decrement last pointer by 1
            firstPointer++;
            lastPointer--;
        }

        // return the array answer
        return ans;
    }
}
