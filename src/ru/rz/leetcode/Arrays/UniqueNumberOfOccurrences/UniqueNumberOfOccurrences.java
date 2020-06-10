package ru.rz.leetcode.Arrays.UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            if (!counts.containsKey(arr[i]))
                counts.put(arr[i], 1);
            else
                counts.put(arr[i], counts.get(arr[i]) + 1);
        }
        HashSet<Integer> seen = new HashSet<>();
        for (Integer k: counts.values()) {
            if (seen.contains(k))
                return false;
            seen.add(k);
        }
        return true;
    }
}

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        System.out.println(new Solution().uniqueOccurrences(new int[]{1,2,2,1,1,3})); // true
        System.out.println(new Solution().uniqueOccurrences(new int[]{1,2})); // false
        System.out.println(new Solution().uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0})); // true
    }
}
