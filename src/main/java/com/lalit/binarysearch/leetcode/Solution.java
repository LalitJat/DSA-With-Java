package com.lalit.binarysearch.leetcode;

import com.lalit.utils.Utils;

public class Solution {
    public static void main(String[] args) {

        String methodName = args.length > 0 ? args[0] : "runNextGreatestLetter";

        switch (methodName){
            case "runNextGreatestLetter":
                // Run next greatest letter
                runNextGreatestLetter();
                break;
            case "runSearchInsertPosition":
                // Run next greatest letter
                runSearchInsertPosition();
                break;
            case "runPickIndexOfMountain":
                // Run next greatest letter
                runPickIndexOfMountain();
                break;
            default:
                System.out.println("NO method executed");
        }
    }

    private static void runNextGreatestLetter() {
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        char[] arr = {'x','x', 'x', 'y','y'};
        char target = 'z';
        char c = nextGreatestLetter.nextGreatestLetter(arr, target);
        Utils.validateOutput(c, 'x');
    }


    private static void runPickIndexOfMountain() {
        PickIndexOfMountain pickIndexOfMountain = new PickIndexOfMountain();
        int[] arr = {0, 10, 5, 2};
        int index = pickIndexOfMountain.peakIndexInMountainArray(arr);
        System.out.println("Peak index : " + index);
    }

    private static void runSearchInsertPosition() {

        // Test cases: arrays of sorted numbers and their corresponding target values
        int[][] nums = {
                {1, 3, 5, 6},
                {1, 3, 5, 6},
                {1, 3, 5, 6},
                {1, 3, 5, 6}
        };
        int[] targets = {5, 2, 7, 0};
        int[] outputs = {2, 1, 4, 0};

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        // Loop through each test case
        for (int i = 0; i < nums.length; i++) {
            // Calculate the ceiling of the target number
            int output = searchInsertPosition.searchInsert(nums[i], targets[i]);
            // Validate the output against the expected value
            Utils.validateOutput(outputs[i], output);
        }
    }
}