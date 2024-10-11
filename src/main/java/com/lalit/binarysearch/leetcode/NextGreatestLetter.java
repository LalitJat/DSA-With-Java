package com.lalit.binarysearch.leetcode;


/**
 * Solution for LeetCode problem "744. Find Smallest Letter Greater Than Target".
 *
 * @see <a href="https://leetcode.com/problems/find-smallest-letter-greater-than-target">Problem Description</a>
 */
public class NextGreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        int left = 0, mid = -1, right = length - 1;

        // Perform binary search
        while (left <= right) {
            mid = left + (right - left) / 2; // Calculate the mid-index

            if (target < letters[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return letters[left % length];
    }
}
