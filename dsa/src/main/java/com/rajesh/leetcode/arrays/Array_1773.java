// leetcode problem - https://leetcode.com/problems/count-items-matching-a-rule/description/
package com.rajesh.leetcode.arrays;

import java.util.List;

public class Array_1773 {
    /**
     * method to solve the given problem
     * 
     * @param items     - a 2D array describing type, color, and name of the ith
     *                  item
     * @param ruleKey   - key of the rule to find the matched item
     * @param ruleValue - value of the rule to be matched with
     * @return number of items that match the given rule
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // create variable count to store the number of items that matches with the
        // given rule
        int countOfItemsMatched = 0;

        // create a variable index and assign a value corresponding to the type to check
        // for the rule given
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        // iterate over the given list of items
        for (List<String> item : items) {
            // check if the value at the given index matches with the value given
            // corresponding to the rule
            if (item.get(index).equals(ruleValue)) {
                // increment the count by 1
                countOfItemsMatched++;
            }
        }

        // return total count of items
        return countOfItemsMatched;
    }
}
