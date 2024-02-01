// video explanation - https://www.youtube.com/watch?v=YxtxNmhiXro
// tag - bit_manipulation, bit_masking
package data_structures;

import java.util.ArrayList;
import java.util.List;

/**
 * In mathematics, the power set (or powerset) of a set S is the set
 * of all subsets of S, including the empty set and S itself.
 * 
 * Example: [1, 2, 3] will have a powerset as - {[], [1], [2], [3], [1,2],
 * [1,3], [2,3], [1,2,3]}
 * 
 * The powerset of a set A will contain 2^n subsets where n is the number of
 * elements present in A.
 */

public class PowerSetBitMasking {

    // private constructor
    private PowerSetBitMasking() {
    }

    /**
     * method to find all possible subsets (the powerset) of an java list of
     * integers
     * 
     * @param numberList - given java list of integers
     * @return java list containing all possible subsets of the given list of
     *         integers
     */
    private static List<List<Integer>> getPowerSet(List<Integer> numberList) {
        // create an array-list to store all possible subsets
        List<List<Integer>> powerset = new ArrayList<>();

        // count total number of possible subsets
        int totalNumberOfSubSets = 1 << numberList.size(); // equivalent to 2^numberList.size()

        // for all number of subsets
        for (int iterator = 0; iterator < totalNumberOfSubSets; iterator++) {
            // create an ArrayList to store the elements of the subset
            List<Integer> subset = new ArrayList<>();

            // if the iterator value is 0 then an empty subset will be added
            if (iterator != 0) {

                // create a variable to keep track of the index of the list element to be added
                // to the subset
                int index = 0;

                // create a variable to store the same value as iterator which will be used to
                // find the index of the list element to be added to the subset
                int iteratorValue = iterator;

                // execute while iteratorValue is greater than 0
                while (iteratorValue > 0) {
                    // check if the LSB is set
                    if ((iteratorValue & 1) == 1) {
                        // add list element at current index to the subset
                        subset.add(numberList.get(index));
                    }

                    // increment index by 1
                    index++;

                    // right shift iteratorValue by 1
                    iteratorValue >>= 1;
                }
            }

            // add the subset to the powerset
            powerset.add(subset);
        }

        return powerset;
    }

    public static void main(String[] args) {
        System.out.println(getPowerSet(List.of()).size() == 1);
        System.out.println(getPowerSet(List.of(1)).size() == 2);
        System.out.println(getPowerSet(List.of(1, 2)).size() == 4);
        System.out.println(getPowerSet(List.of(1, 2, 3)).size() == 8);
        System.out.println(getPowerSet(List.of(1, 2, 3, 4)).size() == 16);
    }
}
