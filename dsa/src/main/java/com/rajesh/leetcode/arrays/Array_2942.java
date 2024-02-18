// leetcode problem - https://leetcode.com/problems/find-words-containing-character/description/
package com.rajesh.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_2942 {
    /**
     * method to solve the given problem
     * 
     * @param words - array of strings
     * @param x     - character to find in the words present inside the array of
     *              words
     * @return an array of indices indicating the words that contains the given
     *         character
     */
    public List<Integer> findWordsContaining(String[] words, char x) {
        // create result list
        List<Integer> result = new ArrayList<>();

        // iterate over the given array of words
        for (int i = 0; i < words.length; i++) {
            // check if the word contains the given character
            if (words[i].indexOf(x) != -1)
                // add the index to the result list
                result.add(i);
        }

        // return result list
        return result;
    }
}
