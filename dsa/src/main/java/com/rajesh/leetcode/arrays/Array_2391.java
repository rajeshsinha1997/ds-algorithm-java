// leetcode problem - https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/description/
package com.rajesh.leetcode.arrays;

public class Array_2391 {
    /**
     * method to solve the given problem
     * 
     * @param garbage - 0 indexed array of strings
     * @param travel  - 0 indexed array of integers
     * @return minimum number of minutes needed to pick all of the garbage
     */
    public int garbageCollection(String[] garbage, int[] travel) {
        // create a variable to store the total time elapsed
        int totalTimeTaken = 0;

        // create variable to store the count of the number of trucks we have to
        // calculate the the travel time for
        int countOfTrucks = 0;

        // create 3 boolean flags to check what kind of garbage we have found already
        boolean haveFoundPaper = false;
        boolean haveFoundGlass = false;
        boolean haveFoundMetal = false;

        // iterate over the given array garbage from last index to first index
        for (int g = garbage.length - 1; g >= 0; g--) {
            // add the total time elapsed to pick all of the garbage at current index to the
            // total time calculating variable
            totalTimeTaken += garbage[g].length();

            // check if the count of truck we need to calculate travel time for is greater
            // than 0
            if (countOfTrucks > 0) {
                // calculate total travel time and add it to the total time elapsed
                totalTimeTaken += countOfTrucks * travel[g];
            }

            // check if the boolean flag value for paper is false and current garbage
            // contains paper waste
            if (!haveFoundPaper && garbage[g].contains("P")) {
                // update it's value to true and also increment the value of the variable
                // storing the count of the trucks by 1
                haveFoundPaper = true;
                countOfTrucks++;
            }

            // check if the boolean flag value for glass is false and current garbage
            // contains glass waste
            if (!haveFoundGlass && garbage[g].contains("G")) {
                // update it's value to true and also increment the value of the variable
                // storing the count of the trucks by 1
                haveFoundGlass = true;
                countOfTrucks++;
            }

            // check if the boolean flag value for metal is false and current garbage
            // contains metal waste
            if (!haveFoundMetal && garbage[g].contains("M")) {
                // update it's value to true and also increment the value of the variable
                // storing the count of the trucks by 1
                haveFoundMetal = true;
                countOfTrucks++;
            }
        }

        // return total time elapsed
        return totalTimeTaken;
    }
}
