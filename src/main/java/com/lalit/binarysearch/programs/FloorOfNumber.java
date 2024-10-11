package com.lalit.binarysearch.programs;

import com.lalit.utils.Utils;

/**
 * This class finds the floor of a target number in a sorted array.
 * The floor is the largest number less than or equal to the target.
 */
public class FloorOfNumber {

    public static void main(String[] args) {
        // Test case: Sorted array and target value
        int[] nums = {1, 3, 5, 6};
        int target = 4;
        int expectedOutput = 3; // Floor of 4

        // Calculate and validate the floor value
        int output = floorOfNumber(nums, target);
        Utils.validateOutput(output, expectedOutput);
    }

    /**
     * Finds the largest number in the sorted array that is less than or equal to the target.
     *
     * @param nums   A sorted array of integers.
     * @param target The target number for which we want to find the floor.
     * @return The floor value or -1 if no such value exists.
     */
    public static int floorOfNumber(int[] nums, int target) {

        // Handle empty array or edge case if target is less that smallest number
        if (nums.length == 0 || nums[0] > target) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        // Perform binary search
        while (left <= right) {
            // Calculate the mid-index
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                // Target found, return it
                return nums[mid];
            } else if (nums[mid] < target) {
                // Move right if mid-value is less than the target
                left = mid + 1;
            } else {
                // Move left if mid-value is greater than the target
                right = mid - 1;
            }
        }

        // Return the floor value or -1 if target is less than minimum value
        return nums[right];
    }
}