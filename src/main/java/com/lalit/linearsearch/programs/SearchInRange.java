package com.lalit.linearsearch.programs;

public class SearchInRange {

    public static void main(String[] args) {
        int[] array = {4, 1,4,3,4,536,7,829,0};
        int elementIndex = linearSearch(array, 3, 2,4);
        System.out.println("Index of element in array is : "+ elementIndex);

        elementIndex = linearSearch(array, 8290, 4,12);
        System.out.println("Index of element in array is : "+ elementIndex);
    }

    // Get element index
    private static int linearSearch(int[] array, int target, int start, int end){

        if(array.length == 0 || end < start)
            return -1;

        for (int index = start; index < end && index < array.length; index++) {
            if(array[index] == target)
                return index;
        }
        return -1;
    }
}
