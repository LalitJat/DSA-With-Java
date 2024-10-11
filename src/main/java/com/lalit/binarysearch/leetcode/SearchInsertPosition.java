package com.lalit.binarysearch.leetcode;

import com.lalit.utils.Utils;

/**
 * Solution for LeetCode problem "35. Search Insert Position".
 *
 * @see <a href="https://leetcode.com/problems/search-insert-position">Problem Description</a>
 */
public class SearchInsertPosition {

    /**
     * This method finds the index of the smallest number in the sorted array
     * that is greater than or equal to the target (ceiling).
     *
     * @param nums   A sorted array of integers.
     * @param target The target number for which we want to find the ceiling.
     * @return The index of the ceiling number or the index where it would be inserted.
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;                 // Initialize the left boundary of the search
        int right = nums.length - 1;  // Initialize the right boundary of the search

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the mid-index

            // Check if the mid-element is equal to the target
            if (nums[mid] == target) {
                return mid; // Target found, return its index
            }
            // If the mid-element is less than the target, search in the right half
            else if (nums[mid] < target) {
                left = mid + 1; // Move left boundary up
            }
            // If the mid-element is greater than the target, search in the left half
            else {
                right = mid - 1; // Move right boundary down
            }
        }

        // At the end of the loop, 'left' is the index of the ceiling number
        return left; // Return the index of the ceiling number
    }
}
