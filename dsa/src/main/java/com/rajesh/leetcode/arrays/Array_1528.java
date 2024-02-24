// leetcode problem - https://leetcode.com/problems/shuffle-string/description/
package com.rajesh.leetcode.arrays;

public class Array_1528 {
    /**
     * method to solve the given problem
     * 
     * @param s       - a string literal
     * @param indices - an array of integers of the same length as s
     * @return the shuffled string
     */
    public String restoreString(String s, int[] indices) {
        // create a temporary character array of the same length as the indices array
        char[] tempCharArray = new char[indices.length];

        // iterate over the indices array
        for (int i = 0; i < indices.length; i++) {
            // place the character at ith index from string s into the indices[i] index in
            // the temporary character array
            tempCharArray[indices[i]] = s.charAt(i);
        }

        // return by adding all the characters of the temporary character array into a
        // single string
        return new String(tempCharArray);
    }
}
