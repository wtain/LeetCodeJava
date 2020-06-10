package ru.rz.leetcode.Math.PowerOfTwo;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        return (n & (n-1)) == 0;
    }
}

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(1)); // true
        System.out.println(new Solution().isPowerOfTwo(16)); // true
        System.out.println(new Solution().isPowerOfTwo(218)); // false
        System.out.println(new Solution().isPowerOfTwo(0)); // false
        System.out.println(new Solution().isPowerOfTwo(-2147483648)); // false
    }
}

