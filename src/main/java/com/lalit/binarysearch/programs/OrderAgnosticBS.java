package com.lalit.binarysearch.programs;

/**
 * Binary Search for order agnostic
 */
public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = -10;
        int index = binarySearch(arr, target);
        System.out.println("Is Element Present in " + index + " index");

        arr = new int[]{10, 6, 4, 2, -1, -5, -50};
        target = -50;
        index = binarySearch(arr, target);
        System.out.println("Is Element Present in " + index + " index");
    }

    static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        boolean isAsc = arr[right] > arr[left];

        // Continue iterating while the left index is greater than the right index
        while (left <= right) {

            // Integer overflow (start + end)/2
            int mid = left + (right - left) / 2;

            // If target is equal to mid element
            if (target == arr[mid])
                return mid;

            if (isAsc) {
                if (arr[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}