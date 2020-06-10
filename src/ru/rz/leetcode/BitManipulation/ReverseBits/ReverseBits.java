package ru.rz.leetcode.BitManipulation.ReverseBits;

/*public */class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            result <<= 1;
            result |= n & 1;
            n >>>= 1;
        }
        return result;
    }
}

public class ReverseBits {
    public static void main(String[] args) {
        // 10100101000001111010011100 -> 111001011110000010100101000000
        System.out.println(new Solution().reverseBits(43261596)); // 964176192
        System.out.println(new Solution().reverseBits(-3)); // -1073741825
    }
}
