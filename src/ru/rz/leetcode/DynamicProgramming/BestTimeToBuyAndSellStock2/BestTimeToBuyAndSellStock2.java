package ru.rz.leetcode.DynamicProgramming.BestTimeToBuyAndSellStock2;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; ++i) {
            maxProfit += Math.max(0, prices[i] - prices[i-1]);
        }
        return maxProfit;
    }
}

public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[] {7,1,5,3,6,4})); // 7
        System.out.println(new Solution().maxProfit(new int[] {1,2,3,4,5})); // 4
        System.out.println(new Solution().maxProfit(new int[] {7,6,4,3,1})); // 0
    }
}
