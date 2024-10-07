package com.lalit.linearsearch.programs;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {4, 1,4,3,4,536,7,829,0};
        int elementIndex = getElementIndex(array, 0);
        System.out.println("Index of element in array is : "+ elementIndex);

        boolean isExist = isElementExistInArray(array, 0);
        System.out.println("Is Element Exist : "+ isExist);
    }

    // Get element index
    private static int getElementIndex(int[] array, int ele){
        for (int index = 0; index < array.length; index++) {
            if(array[index] == ele)
                return index;
        }
        return -1;
    }

    // is element exist
    private static boolean isElementExistInArray(int[] array, int ele){
        for (int i : array) {
            if (i == ele)
                return true;
        }
        return false;
    }
}
