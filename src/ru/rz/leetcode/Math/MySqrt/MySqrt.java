package ru.rz.leetcode.Math.MySqrt;

class Solution {
    public int mySqrt(int x) {
        if (0 == x)
            return 0;
        if (1 == x)
            return 1;

        /*for (int i = x/2; i >= 1; --i)
            if ((long)i*(long)i <= x)
                return i;*/

        /*int low = x / 2;
        while (low * low > 1000)
            low /= 2;

        int high = 1;
        while (high * high < 1000)
            high *= 2;*/

        // 1 2 4
        // 1*1 < 4

        int i1 = 1, i2 = x/2;
        while (i2 >= i1) {
            int m = (i1 + i2) / 2;
            int sqrtx = x / m;
            if (sqrtx == m)
                return m;
            if (sqrtx > m)
                i1 = m+1;
            else
                i2 = m-1;
            /*int m2 = m*m;
            if (m2 == x)
                return m2;
            else if (m2 > x)
                i2 = m-1;
            else
                i1 = m+1;*/
        }

        return i2;

        // 1000
        // 500*500 > 1000
        // 250*250 > 1000
        // 125*125 > 1000
        // 62*62 > 1000
        // 31*31 < 1000

        // 1*1 < 1000
        // 2*2 < 1000
        // 4*4 < 1000
        // ...
        // 32*32 > 1000

        /*int prev_i = x;
        int i = x/2;
        while (i*i > x) {

        }*/

        //return 0;
    }
}

public class MySqrt {
    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(4)); // 2
        System.out.println(new Solution().mySqrt(8)); // 2
        System.out.println(new Solution().mySqrt(0)); // 0
        System.out.println(new Solution().mySqrt(1)); // 1
        System.out.println(new Solution().mySqrt(101)); // 10
        System.out.println(new Solution().mySqrt(100)); // 10
        System.out.println(new Solution().mySqrt(99)); // 9
        System.out.println(new Solution().mySqrt(1000000)); // 1000
        System.out.println(new Solution().mySqrt(2)); // 1
        System.out.println(new Solution().mySqrt(1085817232)); // 32951
    }
}
