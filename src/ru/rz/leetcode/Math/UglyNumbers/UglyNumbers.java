package ru.rz.leetcode.Math.UglyNumbers;

class Solution {

    int divide(int num, int divisor) {
        while (0 == (num % divisor))
            num /= divisor;
        return num;
    }

    public boolean isUgly(int num) {
        if (0 == num)
            return false;
        num = divide(num, 2);
        num = divide(num, 3);
        num = divide(num, 5);
        return 1 == num;
    }
}

public class UglyNumbers {
    public static void main(String[] args) {
        System.out.println(new Solution().isUgly(0)); // false
        System.out.println(new Solution().isUgly(6)); // true
        System.out.println(new Solution().isUgly(8)); // true
        System.out.println(new Solution().isUgly(14)); // false
    }
}
