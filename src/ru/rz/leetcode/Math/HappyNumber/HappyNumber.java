package ru.rz.leetcode.Math.HappyNumber;

import java.util.HashSet;

/*class Solution {

    int nextNumber(int n) {
        int result = 0;
        while (n != 0) {
            int d = n % 10;
            result += d*d;
            n /= 10;
        }
        return result;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<Integer>();
        while (n != 1) {
            if (seen.contains(n))
                return false;
            seen.add(n);
            n = nextNumber(n);
        }
        return true;
    }
}*/

class Solution {

    int nextNumber(int n) {
        int result = 0;
        while (n != 0) {
            int d = n % 10;
            result += d*d;
            n /= 10;
        }
        return result;
    }

    public boolean isHappy(int n) {

        if (1 == n)
            return true;

        int slow = nextNumber(n);
        if (slow == 1)
            return true;
        int fast = nextNumber(slow);

        while (fast != 1) {
            if (slow == fast)
                return false;
            slow = nextNumber(slow);
            fast = nextNumber(fast);
            if (1 == fast)
                return true;
            fast = nextNumber(fast);
        }

        return true;
    }
}

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(19)); // true
        System.out.println(new Solution().isHappy(18)); // false
        // 18 -> 1+64-65->36+25=61->36+1=37=9+49=58->25+64=89->64+81=145->1+16+25=42->16+4=20->4->16->37
    }
}
