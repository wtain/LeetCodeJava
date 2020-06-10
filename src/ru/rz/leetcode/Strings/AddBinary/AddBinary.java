package ru.rz.leetcode.Strings.AddBinary;

class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        StringBuilder result = new StringBuilder();
        int i1 = n1-1;
        int i2 = n2-1;
        int c = 0;
        while (i1 >= 0 || i2 >= 0 || c != 0) {
            int d1 = 0, d2 = 0, r = 0;
            if (i1 >= 0)
                d1 = a.charAt(i1) - '0';
            if (i2 >= 0)
                d2 = b.charAt(i2) - '0';

            r = d1 + d2 + c;
            c = r / 2;
            r %= 2;
            char ci = '0';
            ci += r;
            result.append(ci);
            i1 --; i2--;
        }
        return result.reverse().toString();
    }
}

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("11", "1")); // 100
        System.out.println(new Solution().addBinary("1010", "1011")); // 10101
    }
}
