package com.lalit.binarysearch.leetcode;


import com.lalit.utils.Utils;

import java.util.Arrays;

/**
 * Solution for LeetCode problem "".
 *
 * @see <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array">Problem Description</a>
 */
public class FirstAndLastPosition {

    // Brute-Force approach to find first & last position of target in sorted Array
    public int[] searchRangeBruteForce(int[] nums, int target) {

        int[] ans = {-1, -1};
        int n = nums.length;

        if(n == 0 || nums[0] > target || nums[n-1] < target){
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                if(ans[0] == -1){
                    ans[0] = i;
                }
                ans[1] = i;
            } else if(nums[i] > target){
                break;
            }
        }

        return ans;
    }

    // Binary
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        int right = nums.length - 1;

        if(right == 0 || nums[0] > target || nums[right-1] < target){
            return ans;
        }

        ans[0] = search(nums, target, true);
        if(ans[0] == -1) return ans;
        ans[1] = search(nums, target, false);
        return ans;
    }

    public int search(int[] nums, int target, boolean isStart){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                ans  = mid;
                if(isStart){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                end = mid + 1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();

        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1};
        int target = 2;

        int[] expectedOutput = {-1,-1};

        int[] output = firstAndLastPosition.searchRange(nums, target);
        System.out.println("OP : "+ Arrays.toString(output));
        Utils.validateOutput(output, expectedOutput);
    }

}
