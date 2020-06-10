package ru.rz.leetcode.Arrays.SearchInsertPosition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l != r) {
            int m = l + (r-l)/2;
            if (nums[m] == target)
                return m;
            if (nums[m] < target)
                l = m+1;
            else
                r = m;
        }
        return l;
    }
}

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[] {1,3,5,6}, 5)); // 2
        System.out.println(new Solution().searchInsert(new int[] {1,3,5,6}, 2)); // 1
        System.out.println(new Solution().searchInsert(new int[] {1,3,5,6}, 7)); // 4
        System.out.println(new Solution().searchInsert(new int[] {1,3,5,6}, 0)); // 0
        System.out.println(new Solution().searchInsert(new int[] {1,3}, 2)); // 1
    }
}
