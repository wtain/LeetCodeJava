package ru.rz.leetcode.Math.PalindromeNumber;

class Solution {

    int getPow(int x) {
        int pow = 1;
        while (x / pow >= 10)
            pow *= 10;
        return pow;
    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int l = getPow(x);
        int r = 1;

        int xl = x, xr = x;

        while (l > r) {
            int dl = xl / l;
            xl %= l;
            int dr = xr % 10;
            xr /= 10;

            if (dl != dr)
                return false;

            l /= 10;
            r *= 10;
        }
        return true;
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121)); // true
        System.out.println(new Solution().isPalindrome(-121)); // false
        System.out.println(new Solution().isPalindrome(10)); // false
        System.out.println(new Solution().isPalindrome(9999)); // true
        System.out.println(new Solution().isPalindrome(1001)); // true
        System.out.println(new Solution().isPalindrome(1001)); // true
        System.out.println(new Solution().isPalindrome(2147447412)); // true
        System.out.println(new Solution().isPalindrome(2147447411)); // false

        // 2147483647
        // 2147447412
    }
}
