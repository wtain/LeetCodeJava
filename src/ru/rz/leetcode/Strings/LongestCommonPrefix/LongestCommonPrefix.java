package ru.rz.leetcode.Strings.LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            int m = strs[i].length();
            if (m < prefix.length())
                prefix = prefix.substring(0, m);
            else
                m = prefix.length();
            for (int j = 0; j < m; ++j)
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    prefix = prefix.substring(0, j);
                    break;
                }
        }
        return prefix;
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[] {"flower","flow","flight"})); // fl
        System.out.println(new Solution().longestCommonPrefix(new String[] {"dog","racecar","car"})); //
    }
}
