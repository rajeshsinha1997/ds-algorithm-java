// leetcode problem - https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/
// video explanation - https://www.youtube.com/watch?v=3-c1Gc-5QnE
package com.rajesh.leetcode.arrays;

public class Array_2125 {
    private int countNumberOfOneInAGivenString(String number) {
        // create variable to store the count of one's
        int count = 0;

        // create a variable index to store the next index of the character '1' in the
        // given string
        int ind = number.indexOf("1");

        // continue until we reach to the last position of the character '1' in the
        // given string
        while (ind != -1) {
            // increment the count by 1
            count++;

            // get the next index of the character '1' in the given string
            ind = number.indexOf("1", ind + 1);
        }

        // return total count of one's
        return count;
    }

    /**
     * method to solve the given problem
     * 
     * @param bank - O indexed array of binary strings
     * @return total number of laser beams in the bank
     */
    public int numberOfBeams(String[] bank) {
        // create variable to store total number of laser beams
        int totalNumberOfLaserBeams = 0;

        // create a counter array to store the number of security devices in each row
        int[] counterArray = new int[bank.length];

        // iterate over the given bank array
        for (int i = 0; i < bank.length; i++) {
            // calculate the total number of security devices in current floor and store it
            // in the count array
            counterArray[i] = countNumberOfOneInAGivenString(bank[i]);

        }

        // create two pointer variable where the first will point to the first
        // occurrence
        // of the floor which has at least one security device, and the second will
        // iterate to find the next such floor
        int firstPointer = 0;
        int secondPointer = 0;

        // continue while first pointer reaches to the last index of the counter array
        while (firstPointer < counterArray.length) {
            // check if the current floor pointed by first pointer has at least one security
            // device
            if (counterArray[firstPointer] > 0) {
                // move second pointer to the next index of first pointer
                secondPointer = firstPointer + 1;

                // start moving second pointer until it reaches to the last index of the counter
                // array or reaches to the next floor which has at least one security device
                // installed
                while (secondPointer < counterArray.length && counterArray[secondPointer] == 0) {
                    // increment second pointer by 1
                    secondPointer++;
                }

                // check if second pointer has crossed the last index of the counter array
                if (secondPointer == counterArray.length) {
                    // break out of the loop
                    break;
                }

                // multiply the values pointed by first and second pointer and add it to the
                // total count
                totalNumberOfLaserBeams += counterArray[firstPointer] * counterArray[secondPointer];

                // move first pointer to the index pointed by second pointer
                firstPointer = secondPointer;
            } else {
                // move first pointer until it reaches to the last index of the counter array or
                // reaches to a floor which has at least one security device installed
                while (firstPointer < counterArray.length && counterArray[firstPointer] == 0) {
                    // increment first pointer by 1
                    firstPointer++;
                }
            }
        }

        // return total number of laser beams
        return totalNumberOfLaserBeams;
    }
}
