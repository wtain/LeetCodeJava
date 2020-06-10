package ru.rz.leetcode.Math.PlusOne;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] result = new int[n+1];
        for (int i = 0; i < n; ++i)
            result[n-i] = digits[n-i-1];
        result[0] = 0;
        int c = 1;
        int i = n;
        while (c > 0 && i >= 0) {
            result[i] += c;
            if (result[i] == 10) {
                result[i] = 0;
                c = 1;
            } else {
                c = 0;
            }
            --i;
        }

        if (result[0] != 0)
            return result;

        int[] result1 = new int[n];
        for (i = 0; i < n; ++i)
            result1[i] = result[i+1];
        return result1;
    }
}

public class PlusOne {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(String.format("%d ", arr[i]));
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Solution().plusOne(new int[] {1,2,3})); // 1 2 4
        printArray(new Solution().plusOne(new int[] {4,3,2,1})); // 4 3 2 2
        printArray(new Solution().plusOne(new int[] {9})); // 1 0
    }
}
