package ru.rz.leetcode.Arrays.MoveZeroes;

class Solution {
    public void moveZeroes(int[] nums) {
        int r = 0, w = 0;
        int n = nums.length;
        while (r < n) {
            if (0 != nums[r])
                nums[w++] = nums[r];
            ++r;
        }
        while (w < n)
            nums[w++] = 0;
    }
}

public class MoveZeroes {

    static void printArr(int[] nums) {
        for (int n: nums)
            System.out.print(String.format("%d ", n));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{0,1,0,3,12};
        new Solution().moveZeroes(arr1);
        printArr(arr1); // 1,3,12,0,0
    }
}
