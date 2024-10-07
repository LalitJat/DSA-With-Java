package com.lalit.linearsearch.leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Solution for LeetCode problem "Richest Customer Wealth".
 *
 * @see <a href="https://leetcode.com/problems/richest-customer-wealth">1672. Problem Description/a>
 */

public class MaximumWealth {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] input1 = {{1,2,3},{3,2,1}};
        int maxWealth = solution.maximumWealth(input1);
        if(maxWealth != 6)
            System.out.println("ERROR: Invalid Output");
        else
            System.out.println("Passed Test Case.");
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
       return findMaximumWealthByStream(accounts);
    }

    // Nesting Loop
    private int findMaximumWealth(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }

            if (sum > maxWealth)
                maxWealth = sum;
        }
        return maxWealth;
    }

    // Nesting Loop
    private int findMaximumWealthByStream(int[][] accounts){
        return Arrays.stream(accounts).mapToInt(customer -> Arrays.stream(customer).sum()).max().orElse(0);
    }
}