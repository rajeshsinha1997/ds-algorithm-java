// video explanation - https://www.youtube.com/watch?v=7kIVfVY6Axk
// tag - sorting, insertion_sort
package data_structures.sorting;

import java.util.Arrays;

public class InsertionSort {
    // private constructor
    private InsertionSort() {
    }

    /**
     * method to swap two elements of a given array
     * 
     * @param arr - given array
     * @param fi  - index of the given first array element
     * @param si  - index of the given second array element
     */
    private static void swapArrayElements(int[] arr, int fi, int si) {
        // swap two array elements
        int bucket = arr[fi];
        arr[fi] = arr[si];
        arr[si] = bucket;
    }

    /**
     * method to sort a given array using insertion sort
     * 
     * @param arr - given unsorted array
     * @return sorted array
     */
    private static int[] sort(int[] arr) {
        // store the length of the array
        int len = arr.length;

        // create variable to count the total number of rounds
        int rounds = 0;

        // create index variable to store the index we will be operating on, sorting
        // will start from index 1 (0 based)
        int index = 1;

        // execute for n-1 number of rounds where n is the number of elements in the
        // given array
        while (rounds < (len - 1)) {
            // create a temporary index variable to point at the same element where the
            // index variable is pointing
            int tempIndex = index;

            // execute while the element pointed by the temporary index variable is lesser
            // than the element present previous to that
            while (arr[tempIndex - 1] > arr[tempIndex]) {
                // swap the two elements
                swapArrayElements(arr, tempIndex, tempIndex - 1);

                // decrease temporary index variable by 1
                tempIndex--;

                // check if temporary index variable has reached to the starting position of the
                // given array
                if (tempIndex == 0) {
                    // come out of the loop
                    break;
                }
            }

            // increment index variable by 1
            index++;

            // increment round by 1
            rounds++;
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
