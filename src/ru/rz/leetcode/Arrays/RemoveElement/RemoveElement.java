package ru.rz.leetcode.Arrays.RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int w = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] != val)
                nums[w++] = nums[i];
        }
        return w;
    }
}

public class RemoveElement {

    static void printArr(int[] nums, int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(String.format("%d ", nums[i]));
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = new int[] {3,2,2,3};
        int n1 = new Solution().removeElement(arr1, 3);
        System.out.println(n1); // 2
        printArr(arr1, n1);

        int[] arr2 = new int[] {0,1,2,2,3,0,4,2};
        int n2 = new Solution().removeElement(arr2, 2);
        System.out.println(n2); // 5
        printArr(arr2, n2);
    }
}
