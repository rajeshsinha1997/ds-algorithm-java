// leetcode problem - https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
package com.rajesh.leetcode.arrays;

public class Array_2114 {
    /**
     * method to solve the given problem
     * 
     * @param sentences - array of strings
     * @return maximum number of words that a sentence contains
     */
    public int mostWordsFound(String[] sentences) {
        // create variable to store the maximum number of words in a sentence
        int maximumNumberOfWords = 0;

        // iterate over the given array of strings
        for (String sentence : sentences) {
            // create temporary variable to store the number of words in the current string
            int count = 0;

            // store the first index of the space (' ') character in the current string
            int indexOfSpace = sentence.indexOf(" ");

            // continue until we reach at the last space character in the current string
            while (indexOfSpace != -1) {
                // get the next index of the space (' ') character
                indexOfSpace = sentence.indexOf(" ", indexOfSpace + 1);

                // increment count of words in current string by 1
                count++;
            }

            // check if current string has maximum number of words in it
            if (count > maximumNumberOfWords) {
                // update the value of maximum number of words in a string
                maximumNumberOfWords = count;
            }
        }

        // return maximum number of words in a sentence incremented by 1
        return maximumNumberOfWords + 1;
    }
}
