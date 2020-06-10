package ru.rz.leetcode.Strings.CountAndSay;

class Solution {
    public String countAndSay(int n) {
        String[] results = new String[n];
        results[0] = "1";
        for (int m = 2; m <= n; ++m) {
            int i = m-1;
            results[i] = readCountAndSay(results[i-1]);
        }
        return results[n-1];
    }

    String readCountAndSay(String in) {
        StringBuilder result = new StringBuilder();
        int n = in.length();

        int i = 0;
        while (i < n) {
            if (i == n) {
                result.append('1');
                result.append(in.charAt(i-1));
            } else {
                int i0 = i;
                i++;
                while (i < n && in.charAt(i-1) == in.charAt(i))
                    ++i;
                int c = i - i0;
                result.append(c);
                result.append(in.charAt(i0));
            }
        }

        return result.toString();
    }
}

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(1)); // 1
        System.out.println(new Solution().countAndSay(2)); // 11
        System.out.println(new Solution().countAndSay(3)); // 21
        System.out.println(new Solution().countAndSay(4)); // 1211
        System.out.println(new Solution().countAndSay(5)); // 111221
    }
}
