package ru.rz.leetcode.DynamicProgramming.BestTimeToBuyAndSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; ++i) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[] {7,1,5,3,6,4})); // 5
        System.out.println(new Solution().maxProfit(new int[] {7,6,4,3,1})); // 0
    }
}
