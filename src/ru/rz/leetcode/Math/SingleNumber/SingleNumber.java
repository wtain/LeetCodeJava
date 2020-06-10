package ru.rz.leetcode.Math.SingleNumber;

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; ++i)
            result ^= nums[i];
        return result;
    }
}

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[] {2,2,1})); // 1
        System.out.println(new Solution().singleNumber(new int[] {4,1,2,1,2})); // 4
    }
}
