package ru.rz.leetcode.Arrays.RotateArray;

// 1 2 3 4 5 6 7
// 5 6 7 1 2 3 4

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int j = 0, i = 0;
        while (i < n) {
            int j0 = j;
            int val = nums[j];
            do {
                int newj = (j + k) % n;
                int tmp = nums[newj];
                nums[newj] = val;
                val = tmp;
                ++i;
                j = newj;
            } while (j0 != j && i < n);
            ++j;
        }
    }
}

public class RotateArray {

    static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; ++i)
            System.out.print(String.format("%d ", nums[i]));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5,6,7};
        new Solution().rotate(arr1, 3);
        printArr(arr1); // 5,6,7,1,2,3,4

        int[] arr2 = new int[] {-1,-100,3,99};
        new Solution().rotate(arr2, 2);
        printArr(arr2); // 3,99,-1,-100
    }
}
