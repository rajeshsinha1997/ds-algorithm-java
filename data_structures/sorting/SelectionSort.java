// video explanation - https://www.youtube.com/watch?v=UdO2NeHB46c
// tags - sorting, selection_sort
package data_structures.sorting;

import java.util.Arrays;

public class SelectionSort {
    // private constructor
    private SelectionSort() {
    }

    /**
     * method to sort a given unsorted array using selection sort
     * 
     * @param arr - given unsorted array
     * @return sorted array
     */
    private static int[] sort(int[] arr) {
        // create variable to store the length of the given array
        int len = arr.length;

        // create variable to store the value of the minimum element of a iteration
        int minimumValue = Integer.MAX_VALUE;

        // create variable to store the index of the minimum valued element
        int minimumValueIndex = -1;

        // start iterating from 0th index to the second last index of the given array
        for (int index = 0; index < len - 1; index++) {
            // search for the minimum value that exists on the right hand side of the given
            // array
            for (int iterator = index; iterator < len; iterator++) {
                // check if the current iterator value is the minimum value
                if (arr[iterator] < minimumValue) {
                    // update index of the minimum valued element
                    minimumValueIndex = iterator;

                    // update minimum value
                    minimumValue = arr[iterator];
                }
            }

            // swap element at current index with the minimum value
            arr[minimumValueIndex] = arr[index];
            arr[index] = minimumValue;

            // reset variable holding the minimum value and variable holding the index of
            // the minimum valued element
            minimumValue = Integer.MAX_VALUE;
            minimumValueIndex = -1;
        }

        // return sorted array
        return arr;
    }

    // main method
    public static void main(String[] args) {
        // test - 1
        int[] unsortedArray = new int[] { 5, 4, 3, 2, 1 };
        int[] sortedArray = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.equals(sortedArray, sort(unsortedArray)));

        // test - 2
        unsortedArray = new int[] { 5, -4, 3, -2, 1 };
        sortedArray = new int[] { -4, -2, 1, 3, 5 };
        System.out.println(Arrays.equals(sortedArray, sort(unsortedArray)));

        // test - 2
        unsortedArray = new int[] { 1, 2, 3, 4, 5 };
        sortedArray = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.equals(sortedArray, sort(unsortedArray)));
    }
}
