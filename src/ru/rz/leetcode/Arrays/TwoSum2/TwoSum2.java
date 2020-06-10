package ru.rz.leetcode.Arrays.TwoSum2;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n-1; ++i) {
            int t = target - numbers[i];
            int index = Arrays.binarySearch(numbers, i+1, n, t);
            if (index >= 0)
                return new int[] {i+1, index+1};
        }
        return null;
    }
}

public class TwoSum2 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(String.format("%d ", arr[i]));
        System.out.println();
    }

    public static void main(String[] args) {

        printArray(new Solution().twoSum(new int[]{2,7,11,15}, 9)); // 1 2

        printArray(new Solution().twoSum(new int[]{1,2,3,4,4,9,56,90}, 8)); // 4 5
    }
}
