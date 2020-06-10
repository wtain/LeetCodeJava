package ru.rz.leetcode.Math.ExcelSheetColumnNumber;

class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        int n = s.length();
        int p = 1;
        for (int i = n-1; i >= 0; --i) {
            int d = s.charAt(i) - 'A';
            result += (d+1) * p;
            p *= 26;
        }
        return result;
    }
}

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("A")); // 1
        System.out.println(new Solution().titleToNumber("AB")); // 28
        System.out.println(new Solution().titleToNumber("ZY")); // 701

        System.out.println(new Solution().titleToNumber("AAA")); // 703
    }
}
