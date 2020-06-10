package ru.rz.leetcode.BitManipulation.NumberOfOneBits;

/*public *//*class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            if (1 == (n & 1))
                ++result;
            n >>>= 1;
        }
        return result;
    }
}*/

/*public */class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            ++result;
            n &= (n-1);
        }
        return result;
    }
}

public class NumberOfOneBits {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(0b00000000000000000000000000001011)); // 3
        System.out.println(new Solution().hammingWeight(0b00000000000000000000000010000000)); // 1
        System.out.println(new Solution().hammingWeight(-3)); // 31
    }
}
