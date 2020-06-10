package ru.rz.leetcode.Strings.ValidPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i1 = 0, i2 = n-1;
        while (i1 < i2) {
            while (i1 < i2 && !Character.isLetterOrDigit(s.charAt(i1)))
                ++i1;
            while (i1 < i2 && !Character.isLetterOrDigit(s.charAt(i2)))
                --i2;
            if (Character.toLowerCase(s.charAt(i1)) != Character.toLowerCase(s.charAt(i2)))
                return false;
            ++i1; --i2;
        }
        return true;
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("")); // true
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(new Solution().isPalindrome("race a car")); // false
        System.out.println(new Solution().isPalindrome("0P")); // false
        System.out.println(new Solution().isPalindrome("P")); // true
    }
}
