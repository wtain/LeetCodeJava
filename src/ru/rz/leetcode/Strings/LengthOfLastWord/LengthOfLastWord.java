package ru.rz.leetcode.Strings.LengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i2 = n-1;
        while (i2 >= 0 && s.charAt(i2) == ' ')
            --i2;
        if (i2 < 0)
            return 0;
        int i1 = i2;
        while (i1 >= 0 && s.charAt(i1) != ' ')
            --i1;
        return i2-i1;
    }
}

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("Hello World")); // 5
        System.out.println(new Solution().lengthOfLastWord("")); // 0
        System.out.println(new Solution().lengthOfLastWord(" ")); // 0
        System.out.println(new Solution().lengthOfLastWord("aaa")); // 3
    }
}
