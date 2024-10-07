package com.lalit.linearsearch.leetcode;

/**
 * Solution for LeetCode problem "Find Numbers with Even Number of Digits".
 *
 * @see <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits">Problem Description</a>
 */
public class FindNumbersWithEvenNumberDigits {

    public static void main(String[] args) {
        int[] numbs = {12, 34, 555, 666, 6166};
        int result = findNumbers(numbs);
        System.out.println("Count of numbers with even digits: " + result);
    }

    /**
     * Finds the count of numbers with even number of digits in the given array.
     *
     * @param numbs Input array of integers
     * @return Count of numbers with even number of digits
     */
    static int findNumbers(int[] numbs) {
        int evenCount = 0;
        for (int num : numbs) {
            // Check if the input has even numbers of digits using logarithmic method
            if (isEvenNumberOfDigitsLog(num)) {
                evenCount++;
            }
        }
        return evenCount;
    }

    /**
     * Checks if a number has an even number of digits using logarithmic method.
     * <p><i>Time Complexity : {@code O(1)}</i></p>
     * @param num Input number
     * @return True if the number has even numbers of digits, false otherwise
     */
    static boolean isEvenNumberOfDigitsLog(int num) {
        // Calculate digit count using logarithm
        int countOfDigits = (int) Math.log10(Math.abs(num)) + 1;
        return countOfDigits % 2 == 0;
    }

    /**
     * Checks if a number has an even number of digits using iterative method.
     * @param num Input number
     * @return True if the number has even numbers of digits, false otherwise
     */
    static boolean isEvenNumberOfDigitsIterative(int num) {
        int countOfDigits = 0;
        while (Math.abs(num) > 0) {
            countOfDigits++;
            num /= 10;
        }
        return countOfDigits % 2 == 0;
    }

    /**
     * Checks if a number has an even number of digits using string conversion method.
     * @param num Input number
     * @return True if the number has even numbers of digits, false otherwise
     */
    static boolean isEvenNumberOfDigitsString(int num) {
        String numStr = String.valueOf(Math.abs(num));
        return numStr.length() % 2 == 0;
    }
}