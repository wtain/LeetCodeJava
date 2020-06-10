package ru.rz.leetcode.Math.FactorialTrailingZeros;

class Solution {
    public int trailingZeroes(int n) {
        // 1*2*3*4*5*6*7*8*9*10
        int result = n / 5;
        int t = result;
        while (t >= 5) {
            t /= 5;
            result += t;
        }
        return result;
    }
}

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        System.out.println(new Solution().trailingZeroes(3)); // 0
        System.out.println(new Solution().trailingZeroes(5)); // 1
        System.out.println(new Solution().trailingZeroes(100)); // 24
    }
}
