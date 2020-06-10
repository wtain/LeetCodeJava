package ru.rz.leetcode.Math.ReverseInteger;

class Solution {
    public int reverse(int x) {
        if (x == -2147483648)
            return 0;
        if (x < 0)
            return -reverse(-x);

        int result = 0;
        while (x > 0) {
            int d = x % 10;

            if (result > 214748364)
                return 0;

            result = 10*result + d; // result > 2147483647
            // 10*result+d > 2147483647
            // 10*result > 2147483647-d
            // result > 214748364

            x /= 10;
        }
        return result;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123)); // 321
        System.out.println(new Solution().reverse(-123)); // -321
        System.out.println(new Solution().reverse(120)); // 21
        System.out.println(new Solution().reverse(1534236469)); // 0
        System.out.println(new Solution().reverse(-2147483412)); // -2143847412
        System.out.println(new Solution().reverse(-2147483648)); // 0
    }
}
