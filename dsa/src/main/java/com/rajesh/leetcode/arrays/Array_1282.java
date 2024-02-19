// leetcode problem - https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/description/
package com.rajesh.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array_1282 {
    /**
     * method to solve the given problem
     * 
     * @param groupSizes - an array of positive integers
     * @return return a list of the groups
     */
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        // store the length of the array
        int n = groupSizes.length;

        // create result list
        List<List<Integer>> result = new ArrayList<>();

        // create map to keep updating the group as we execute
        Map<Integer, List<Integer>> groupMap = new HashMap<>();

        // iterate over the given group array
        for (int i = 0; i < n; i++) {
            // store the expected size of the group for current index into a variable
            int groupSize = groupSizes[i];

            // store the list of the indices associated with the current group size into a
            // variable
            List<Integer> temp = groupMap.getOrDefault(groupSize, new ArrayList<>());

            // add the current index to the list
            temp.add(i);

            // check if the current size of the list is same as the group size
            if (temp.size() == groupSize) {
                // add the list to the result array
                result.add(temp);

                // update the variable to point to a new empty list of integers
                temp = new ArrayList<>();

            }

            // add the list back to the map
            groupMap.put(groupSize, temp);

        }

        // return result list
        return result;
    }
}
