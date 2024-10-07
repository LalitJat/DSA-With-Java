package com.lalit.linearsearch.programs;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1}, {18, 12, 3, 9}, {78, 99, 34, 56}, {18, 12}};
        int target = 1111;

        int[] result = search(arr, target);
        System.out.printf("Element find at index {%d, %d}%n", result[0], result[1]);
    }

    static int[] search(int[][] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
