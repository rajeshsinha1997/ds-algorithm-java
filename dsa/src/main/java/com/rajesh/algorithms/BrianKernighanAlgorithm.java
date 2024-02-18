// Video Explanation - https://www.youtube.com/watch?v=u96TGyV73kk
// Video Explanation - https://www.youtube.com/watch?v=e0sVe4-JJJI
// tag - bit_manipulation, bit_masking
package com.rajesh.algorithms;

public class BrianKernighanAlgorithm {

    // private constructor
    private BrianKernighanAlgorithm() {
    }

    /**
     * method to count number of set bits in a given integer number using Brian
     * Kernighan's Algorithm
     * 
     * @param givenNumber - the given integer number
     * @return number of set bits in that given integer number
     */
    public static int countNumberOfSetBits(int givenNumber) {
        // initialize count as 0
        int count = 0;

        // while given integer number is greater than 0
        while (givenNumber > 0) {
            // do bitwise & with given integer number and (given integer number -1)
            givenNumber = (givenNumber & (givenNumber - 1));

            // increment count by 1
            count++;
        }

        // return count
        return count;
    }
}
