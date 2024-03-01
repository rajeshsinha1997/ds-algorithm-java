package com.rajesh.leetcode.strings;

public class String_2864 {
    /**
     * method to solve the given problem
     * 
     * @param s - a binary string
     * @return a string representing the maximum odd binary number that can be
     *         created from the given combination
     */
    public String maximumOddBinaryNumber(String s) {
        // convert the given string to a character array
        char[] characterArray = s.toCharArray();

        // create a counter variable to store the count of '1' in the given string
        int countOfOne = 0;

        // iterate over the given character array and count the number of '1'
        for (char c : characterArray) {
            // check if the current character is '1'
            if (c == '1') {
                // increment the counter by 1
                countOfOne++;
            }
        }

        // set the value at the last index of the character array to '1' and decrement
        // the counter by 1
        characterArray[characterArray.length - 1] = '1';
        countOfOne--;

        // create a pointer to point at the first index of the character array
        int firstPointer = 0;

        // continue while the counter value is greater than 0
        while (countOfOne > 0) {
            // update the value at the index pointed by the pointer to '1' and increment
            // the value of the pointer by 1
            characterArray[firstPointer++] = '1';

            // decrement the value of the counter by 1
            countOfOne--;
        }

        // continue while the pointer reaches to the index previous to the last index of
        // the character array
        while (firstPointer < characterArray.length - 1) {
            // update the value at index pointed by pointer to '0' and increment the pointer
            // by 1
            characterArray[firstPointer++] = '0';
        }

        // build a string from the character array and return as result
        return new String(characterArray);
    }
}
