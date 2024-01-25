// Video Explanation - https://www.youtube.com/watch?v=u96TGyV73kk
// Video Explanation - https://www.youtube.com/watch?v=e0sVe4-JJJI
// tag - bit_manipulation, bit_masking
package algorithms;

public class BrianKernighanAlgorithm {

    // private constructor
    private BrianKernighanAlgorithm() {
    }

    /**
     * method to count number of set bits in a given number using Brian Kernighan's
     * Algorithm
     * 
     * @param givenNumber - the given number
     * @return number of set bits in that given number
     */
    public static int countNumberOfSetBits(int givenNumber) {
        // initialize count as 0
        int count = 0;

        // while given number is greater than 0
        while (givenNumber > 0) {
            // do bitwise & with given number and (given number -1)
            givenNumber = (givenNumber & (givenNumber - 1));

            // increment count by 1
            count++;
        }

        // return count
        return count;
    }

    public static void main(String[] args) {
        // test algorithm
        System.out.println(BrianKernighanAlgorithm.countNumberOfSetBits(0) == 0);
        System.out.println(BrianKernighanAlgorithm.countNumberOfSetBits(1) == 1);
        System.out.println(BrianKernighanAlgorithm.countNumberOfSetBits(2) == 1);
        System.out.println(BrianKernighanAlgorithm.countNumberOfSetBits(3) == 2);
    }
}