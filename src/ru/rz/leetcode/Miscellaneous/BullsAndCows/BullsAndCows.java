package ru.rz.leetcode.Miscellaneous.BullsAndCows;

import java.util.HashMap;

/*class Solution {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        int bulls = 0, cows = 0;
        boolean[] mask = new boolean[n];
        HashMap<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            Character si = secret.charAt(i);
            Character gi = guess.charAt(i);
            if (si == gi) {
                bulls++;
                mask[i] = true;
            } else {
                mask[i] = false;

                if (!counts.containsKey(si))
                    counts.put(si, 1);
                else
                    counts.put(si, counts.get(si)+1);
            }
        }

        for (int i = 0; i < n; ++i) {
            if (mask[i])
                continue;
            Character gi = guess.charAt(i);
            if (counts.containsKey(gi)) {
                ++cows;
                int cnt = counts.get(gi);
                if (cnt > 1)
                    counts.put(gi, cnt - 1);
                else
                    counts.remove(gi);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(bulls);
        sb.append("A");
        sb.append(cows);
        sb.append("B");
        return sb.toString();
    }
}*/

class Solution {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        int bulls = 0, cows = 0;
        int[] counts = new int[10];
        for (int i = 0; i < n; ++i) {
            char si = secret.charAt(i);
            char gi = guess.charAt(i);
            if (si == gi) {
                bulls++;
            } else {

                if (counts[si - '0'] > 0) ++cows;
                --counts[si - '0'];

                if (counts[gi - '0'] < 0) ++cows;
                ++counts[gi - '0'];
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(bulls);
        sb.append("A");
        sb.append(cows);
        sb.append("B");
        return sb.toString();
    }
}

public class BullsAndCows {
    public static void main(String[] args) {
        System.out.println(new Solution().getHint("1807", "7810")); // 1A3B
        System.out.println(new Solution().getHint("1123", "0111")); // 1A1B
    }
}
