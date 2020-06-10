package ru.rz.leetcode.Math.PowerOfThree;

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        return 1162261467 % n == 0;
    }
}

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfThree(27)); // true
        System.out.println(new Solution().isPowerOfThree(0)); // false
        System.out.println(new Solution().isPowerOfThree(9)); // true
        System.out.println(new Solution().isPowerOfThree(45)); // false
        System.out.println(new Solution().isPowerOfThree(1)); // true
        System.out.println(new Solution().isPowerOfThree(-3)); // false
    }
}
