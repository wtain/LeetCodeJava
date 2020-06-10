package ru.rz.leetcode.Math.NimGame;

class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}

public class NimGame {
    public static void main(String[] args) {
        System.out.println(new Solution().canWinNim(4)); // false
        System.out.println(new Solution().canWinNim(3)); // true
        System.out.println(new Solution().canWinNim(2)); // true
        System.out.println(new Solution().canWinNim(1)); // true
    }
}
