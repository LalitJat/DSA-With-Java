package com.lalit.linearsearch.programs;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,-1,-4};
        int min = findMin(nums);

        System.out.println(min);
    }

    static int findMin(int[] arr){

        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int min = arr[0];

        for (int num : arr){
            if(num < min)
                min = num;
        }

        return min;
    }
}
