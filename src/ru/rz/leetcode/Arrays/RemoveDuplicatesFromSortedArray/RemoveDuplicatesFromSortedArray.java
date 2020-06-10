package ru.rz.leetcode.Arrays.RemoveDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int w = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[w-1])
                nums[w++] = nums[i];
        }
        return w;
    }
}

public class RemoveDuplicatesFromSortedArray {

    static void printArr(int[] nums, int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(String.format("%d ", nums[i]));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1,1,2};
        int n1 = new Solution().removeDuplicates(arr1);
        System.out.println(n1); // 2
        printArr(arr1, n1);

        int[] arr2 = new int[] {0,0,1,1,1,2,2,3,3,4};
        int n2 = new Solution().removeDuplicates(arr2);
        System.out.println(n2); // 5
        printArr(arr2, n2);
    }
}
