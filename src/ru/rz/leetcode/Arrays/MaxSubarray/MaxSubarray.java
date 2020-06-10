package ru.rz.leetcode.Arrays.MaxSubarray;

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxSum = nums[0];
        int currSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}

public class MaxSubarray {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
        System.out.println(new Solution().maxSubArray(new int[]{-1})); // -1
        System.out.println(new Solution().maxSubArray(new int[]{-2, 1})); // 1
    }
}
