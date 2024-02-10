// LeetCode Problem - https://leetcode.com/problems/palindromic-substrings/description/
// video explanation - https://www.youtube.com/watch?v=tGAMyZxlwuA
package data_structures;

import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstring {

    // private constructor
    private PalindromicSubstring() {
    }

    /**
     * Brute force way to find the palindrome substrings from a given string
     * 
     * @param s - given string
     * @return list of possible palindrome substrings
     */
    private static List<String> getListOfPalindromeSubStringsByBruteForce(String s) {
        // variable to store the possible palindrome substrings
        List<String> substrings = new ArrayList<>();

        // variable to store the length of the given string
        int n = s.length();

        // iterate over the given string
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // get the substring
                String substring = s.substring(i, j + 1);

                // check if the length of the substring is 1
                if (substring.length() == 1) {
                    // a string with a single character is always palindrome, hence add the
                    // substring to the list
                    substrings.add(substring);
                }

                // check if the length of the substring is 2 and if both of the characters
                // present in the substring are equal
                else if (substring.length() == 2 && (substring.charAt(0) == substring.charAt(1))) {
                    // add the substring to the list
                    substrings.add(substring);
                }

                // check if the length of the substring is greater than 2
                else if (substring.length() > 2) {
                    // create two pointers to traverse the substring
                    int firstPointer = i;
                    int lastPointer = j;

                    // variable to store the flag value denoting if the substring is a palindrome
                    boolean isPalindrome = true;

                    // execute while first pointer value is less then last pointer value
                    while (firstPointer < lastPointer) {
                        // check if the characters pointed by first and last pointers are not same
                        if (substring.charAt(firstPointer) != substring.charAt(lastPointer)) {
                            // update flag value
                            isPalindrome = false;

                            // break the loop
                            break;
                        }

                        // update both of the pointers
                        firstPointer++;
                        lastPointer--;
                    }

                    // check if the substring is a palindrome
                    if (isPalindrome) {
                        // add the substring to the list
                        substrings.add(substring);
                    }
                }
            }
        }

        // return the list of possible palindrome substrings
        return substrings;
    }

    // TODO - Implement more efficient approaches [DP with Memorization, Middle
    // Expansion]

    // main method
    public static void main(String[] args) {
        // test brute force approach
        System.out.println("\n\nBrute Force Approach");
        System.out.println("abc - " + getListOfPalindromeSubStringsByBruteForce("abc"));
        System.out.println("aaa - " + getListOfPalindromeSubStringsByBruteForce("aaa"));
    }
}
