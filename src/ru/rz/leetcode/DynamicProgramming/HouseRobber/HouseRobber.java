package ru.rz.leetcode.DynamicProgramming.HouseRobber;

/*class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] results = new int[nums.length];
        results[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int r1 = results[i-1];
            int r2 = nums[i];
            if (i > 1)
                r2 += results[i-2];
            results[i] = Math.max(r1, r2);
        }
        // 1 2 3 1
        // 1 -> 1
        // 1 2 -> 2
        // 1 2 3
        // 10  1  1 10 => 20
        // 10 10 11 20
        return results[nums.length-1];
    }
}*/

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        int result = nums[0];
        int prev1 = nums[0];
        int prev2 = 0;
        for (int i = 1; i < nums.length; ++i) {
            int r1 = prev1;
            int r2 = prev2 + nums[i];
            result = Math.max(r1, r2);
            prev2 = prev1;
            prev1 = result;
        }
        return result;
    }
}

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[]{1,2,3,1})); // 4
        System.out.println(new Solution().rob(new int[]{2,7,9,3,1})); // 12
        System.out.println(new Solution().rob(new int[]{10, 1, 1, 10})); // 20
    }
}
