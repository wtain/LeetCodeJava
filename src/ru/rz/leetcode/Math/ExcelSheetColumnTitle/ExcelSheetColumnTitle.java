package ru.rz.leetcode.Math.ExcelSheetColumnTitle;

class Solution {

    public String convertToTitle(int n) {

        StringBuilder result = new StringBuilder();

        while (n != 0) {
            int d = (n-1) % 26;
            char dc = 'A';
            dc += d;
            --n;
            n /= 26;
            result.append(dc);
        }
        result.reverse();

        return result.toString();
    }
}

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        for (int i = 1; i <= 28; ++i)
            System.out.print(String.format("%s ", new Solution().convertToTitle(i)));
        System.out.println();

        System.out.println(new Solution().convertToTitle(1)); // A
        System.out.println(new Solution().convertToTitle(28)); // AB
        System.out.println(new Solution().convertToTitle(701)); // ZY
        System.out.println(new Solution().convertToTitle(703)); // AAA

    }
}

