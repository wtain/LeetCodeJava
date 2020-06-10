package ru.rz.leetcode.Strings.IsomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        int n = s.length();
        HashMap<Character, Character> chars = new HashMap<>();
        HashSet<Character> mapped = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if (!chars.containsKey(si)) {
                if (mapped.contains(ti))
                    return false;
                chars.put(si, ti);
                mapped.add(ti);
            } else {
                Character ti1 = chars.get(si);
                if (ti != ti1)
                    return false;
            }
        }
        return true;
    }
}

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic( "egg", "add")); // true
        System.out.println(new Solution().isIsomorphic( "foo", "bar")); // false
        System.out.println(new Solution().isIsomorphic( "paper", "title")); // true
    }
}
