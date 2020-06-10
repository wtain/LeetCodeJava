package ru.rz.leetcode.Strings.ReverseString;

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int n2 = n >> 1;
        for (int i = 0; i < n2; ++i) {
            int j = n-1-i;

            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}

public class ReverseString {

    static void printStr(char[] s) {
        System.out.println(new String(s));
    }

    public static void main(String[] args) {
        char[] s1 = new char[] {'h','e','l','l','o'};
        new Solution().reverseString(s1);
        printStr(s1);

        char[] s2 = new char[] {'H','a','n','n','a','h'};
        new Solution().reverseString(s2);
        printStr(s2);
    }
}
