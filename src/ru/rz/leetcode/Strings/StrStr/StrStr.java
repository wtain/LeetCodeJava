package ru.rz.leetcode.Strings.StrStr;

import java.util.HashMap;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        if (haystack.length() < needle.length())
            return -1;
        long targetHash = calcHash(needle);
        int m = needle.length();
        int n = haystack.length();
        int i = 0;
        long hash = calcHash(haystack.substring(i, i+m));
        do
        {
            if (0 != i)
                hash = recalcHash(hash, m, haystack.charAt(i-1), haystack.charAt(i+m-1));

            if (hash == targetHash && needle.equals(haystack.substring(i, i+m)))
                return i;

            ++i;
        }
        while (i+m <= n);
        return -1;
    }

    static long X = /*3*/47;
    static long Q = 1 << 31;

    static HashMap<Integer, Long> powers = new HashMap<>();

    public static long Xpow(int p) {
        if (powers.containsKey(p))
            return powers.get(p);
        long r = 1;
        for (int i = 0; i < p; ++i)
            r *= X;
        powers.put(p, r);
        return r;
    }

    public static long calcHash(String s) {
        long r = 0;
        for (int i = 0; i < s.length(); ++i)
            r = r * X + s.charAt(i);
        return r;
    }

    public static long recalcHash(long hash, int n, long head, long tail) {
        return (X*(hash - Xpow(n-1) * head) + tail)/* % Q*/;
    }
}


public class StrStr {
    public static void main(String[] args) {

        /*long hash1 = Solution.calcHash("abc");
        long hash2 = Solution.calcHash("bcd");
        long hash3 = Solution.recalcHash(hash1, 3, 'a', 'd');*/

        long hash1 = Solution.calcHash("aaabaaa");
        long hash2 = Solution.calcHash("aabaaac");
        long hash3 = Solution.recalcHash(hash1, 7, 'a', 'c');

        System.out.println(new Solution().strStr("aa", "aa")); // 0
        System.out.println(new Solution().strStr("hello", "ll")); // 2
        System.out.println(new Solution().strStr("aaaaa", "bba")); // -1
        System.out.println(new Solution().strStr("mississippi", "pi")); // 9
        System.out.println(new Solution().strStr("aabaaabaaac", "aabaaac")); // 4
    }
}
