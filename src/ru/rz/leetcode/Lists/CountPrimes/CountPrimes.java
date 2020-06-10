package ru.rz.leetcode.Lists.CountPrimes;

import java.util.HashSet;

class Solution {
    public int countPrimes(int n) {
        //HashSet<Integer> p = new HashSet<>();
        boolean[] seen = new boolean[n];
        if (n <= 2)
            return 0;

        for (int i = 0; i < n; ++i)
            seen[i] = false;

        int sn = (int) Math.sqrt(n);
        int count = 1;
        for (int i = 3; i < n; i += 2) {
            /*if (p.contains(i))
                continue;*/
            if (seen[i])
                continue;
            count++;
            if (i > sn)
                continue;
            for (int j = i; j < n; j += i)
                seen[j] = true;
                //p.add(j);
        }
        return count;
    }
}

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(2)); // 0
        System.out.println(new Solution().countPrimes(10)); // 4
        System.out.println(new Solution().countPrimes(120)); // 30
        System.out.println(new Solution().countPrimes(1500000)); //
    }
}
