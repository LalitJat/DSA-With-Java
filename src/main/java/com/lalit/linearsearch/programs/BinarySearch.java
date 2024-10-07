package com.lalit.linearsearch.programs;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = -10;
        int index = binarySearchAsc(arr, target);
        System.out.println("Is Element Present in " + index + " index");

        arr = new int[]{10, 6, 4, 2, -1, -5, -50};
        target = -50;
        index = binarySearchDesc(arr, target);
        System.out.println("Is Element Present in " + index + " index");

    }

    static int binarySearchAsc(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // Continue iterating while the left index is greater than the right index
        while (left <= right) {

            // Integer overflow (start + end)/2
            int mid = left + (right - left) / 2;

            // If target is equal to mid element
            if (target == arr[mid]) {
                return mid;

                // If target is less than mid-element
            } else if (target < arr[mid]) {
                right = mid - 1;

                // If target is greater than mid-element
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }


    static int binarySearchDesc(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // Continue iterating while the left index is greater than the right index
        while (left <= right) {

            // Integer overflow (start + end)/2
            int mid = left + (right - left) / 2;

            // If target is equal to mid element
            if (target == arr[mid]) {
                return mid;

                // If target is less than mid-element
            } else if (target > arr[mid]) {
                right = mid - 1;

                // If target is greater than mid-element
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}