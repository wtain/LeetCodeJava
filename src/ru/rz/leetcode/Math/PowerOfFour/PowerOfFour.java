package ru.rz.leetcode.Math.PowerOfFour;

class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0)
            return false;
        return (num & (num-1)) == 0 && ((num & 0xAAAAAAAA) == 0);
    }
}

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfFour(16)); // true
        System.out.println(new Solution().isPowerOfFour(5)); // false
        System.out.println(new Solution().isPowerOfFour(6)); // false
        System.out.println(new Solution().isPowerOfFour(8)); // false
        System.out.println(new Solution().isPowerOfFour(32)); // false
        System.out.println(new Solution().isPowerOfFour(64)); // true
        System.out.println(new Solution().isPowerOfFour(4)); // true
        System.out.println(new Solution().isPowerOfFour(1)); // true
    }
}
