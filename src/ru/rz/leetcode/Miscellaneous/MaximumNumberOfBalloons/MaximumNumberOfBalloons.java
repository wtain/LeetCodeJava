package ru.rz.leetcode.Miscellaneous.MaximumNumberOfBalloons;

class Solution {
    public int maxNumberOfBalloons(String text) {
        // balloon
        // a - 1, b - 1, l - 2, n - 1, o - 2
        int na = 0, nb = 0, nl = 0, nn = 0, no = 0;
        int n = text.length();
        for (int i = 0; i < n; ++i) {
            char c = text.charAt(i);
            if (c == 'a')
                ++na;
            else if (c == 'b')
                ++nb;
            else if (c == 'l')
                ++nl;
            else if (c == 'n')
                ++nn;
            else if (c == 'o')
                ++no;
        }
        int result = Math.min(na, nb);
        result = Math.min(result, nl/2);
        result = Math.min(result, nn);
        result = Math.min(result, no/2);
        return result;
    }
}

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        System.out.println(new Solution().maxNumberOfBalloons("nlaebolko")); // 1
        System.out.println(new Solution().maxNumberOfBalloons("loonbalxballpoon")); // 2
        System.out.println(new Solution().maxNumberOfBalloons("leetcode")); // 0
    }
}
