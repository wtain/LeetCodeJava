package ru.rz.leetcode.Arrays.MergeSortedArray;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m-1;
        int r2 = n-1;
        int w = m+n-1;
        while (r1 >= 0 || r2 >= 0) {
            if (r1 < 0)
                nums1[w--] = nums2[r2--];
            else if (r2 < 0)
                nums1[w--] = nums1[r1--];
            else if (nums1[r1] >= nums2[r2])
                nums1[w--] = nums1[r1--];
            else
                nums1[w--] = nums2[r2--];
        }
    }
}

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,0,0,0};
        int[] arr2 = new int[] {2,5,6};
        new Solution().merge(arr1, 3, arr2, 3);

        for (Integer a: arr1)
            System.out.print(String.format("%d ", a));
        System.out.println(); // 1,2,2,3,5,6
    }
}
