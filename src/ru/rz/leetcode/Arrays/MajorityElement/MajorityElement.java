package ru.rz.leetcode.Arrays.MajorityElement;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maj = 0;
        int mc = 0;
        for (int i = 0; i < n; ++i) {
            if (0 == mc)
                maj = nums[i];
            if (nums[i] == maj)
                ++mc;
            else
                --mc;
        }
        return maj;
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[] {3,2,3})); // 3
        System.out.println(new Solution().majorityElement(new int[] {2,2,1,1,1,2,2})); // 2
    }
}
