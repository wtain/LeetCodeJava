package ru.rz.leetcode.DynamicProgramming.ClimbingStairs;

class Solution {
    public int climbStairs(int n) {
        if (0 == n)
            return 0;
        int[] results = new int[n+1];
        results[0] = 1;
        results[1] = 1;
        for (int i = 2; i <= n; ++i)
            results[i] = results[i-2] + results[i-1];

        return results[n];
    }
}

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(2)); // 2;
        System.out.println(new Solution().climbStairs(3)); // 3;
        System.out.println(new Solution().climbStairs(10)); // 89;
    }
}
