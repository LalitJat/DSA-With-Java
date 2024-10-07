package com.lalit.linearsearch.programs;

public class FindMax {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,-1,-4};
        int min = findMax(nums);

        System.out.println(min);
    }

    static int findMax(int[] arr){

        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = arr[0];

        for (int num : arr){
            if(num > max)
                max = num;
        }

        return max;
    }
}
