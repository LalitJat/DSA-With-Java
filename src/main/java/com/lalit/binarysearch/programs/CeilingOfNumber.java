package com.lalit.binarysearch.programs;

import com.lalit.utils.Utils;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6}; // Sorted array
        int target = 4;            // Target value to find the ceiling for
        int expectedOutput = 5;    // Expected ceiling value

        // Calculate the ceiling value and validate the output
        int output = ceilingOfNumber(nums, target);
        Utils.validateOutput(expectedOutput, output);
    }

    /**
     * Finds the smallest number in the sorted array that is
     * greater than or equal to the target (the ceiling).
     *
     * @param nums   A sorted array of integers.
     * @param target The target number for which we want to find the ceiling.
     * @return The ceiling value or -1 if no such value exists.
     */
    public static int ceilingOfNumber(int[] nums, int target) {

        // Handle empty array or edge case if target is less that smallest number
        if (nums.length == 0 || nums[nums.length - 1] < target) {
            return -1;
        }

        int left = 0;                     // Start of the search range
        int right = nums.length - 1;      // End of the search range

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the mid-index

            // If the mid-value is equal to the target, return it
            if (nums[mid] == target) {
                return nums[mid];
            }
            // Move right if mid-value is less than the target
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // Move left if mid-value is greater than the target
            else {
                right = mid - 1;
            }
        }

        // If array is empty or target if greater than maximum value
        return nums[left];
    }
}
