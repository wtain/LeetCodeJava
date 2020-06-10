package ru.rz.leetcode.Math.AddDigits;

/*class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int tmp = 0;
            while (num > 0) {
                tmp += num % 10;
                num /= 10;
            }
            num = tmp;
        }
        return num;
    }
}*/

class Solution {
    public int addDigits(int num) {
        if (0 == num)
            return 0;
        num = num % 9;
        if (0 == num)
            num = 9;
        return num;
    }
}

// 38 => 3*10+8=3+9+3+8 mod 9 = 3+8 mod 9
// a0a1a2...an = a0+a1+...+an + 9*A

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(new Solution().addDigits(38)); // 2
    }
}
