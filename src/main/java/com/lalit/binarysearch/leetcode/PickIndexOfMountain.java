package com.lalit.binarysearch.leetcode;

/**
 * Solution for LeetCode problem "852. Peak Index in a Mountain Array".
 *
 * @see <a href="https://leetcode.com/problems/peak-index-in-a-mountain-array">Problem Description</a>
 */
public class PickIndexOfMountain {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare middle element with the next element
            if (arr[mid] < arr[mid + 1]) {
                // Peak is on the right side
                left = mid + 1;
            } else {
                // Peak is on the left side or mid is the peak
                right = mid;
            }
        }

        return left;
    }
}