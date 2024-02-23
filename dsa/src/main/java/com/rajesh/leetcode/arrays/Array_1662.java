// leetcode problem - https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
package com.rajesh.leetcode.arrays;

public class Array_1662 {
    /**
     * method to solve the given problem
     * 
     * @param word1 - array of strings
     * @param word2 - array of strings
     * @return true if both the arrays represents the same string, false otherwise
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // construct the strings from both of the arrays and return the result by
        // comparing those two strings
        return String.join("", word1).equals(String.join("", word2));
    }
}
