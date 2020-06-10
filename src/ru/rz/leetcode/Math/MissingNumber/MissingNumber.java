package ru.rz.leetcode.Math.MissingNumber;

import java.util.Arrays;

/*class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumExpected = (0+n)*(n+1)/2;
        int sum = Arrays.stream(nums).sum();
        return sumExpected - sum;
    }
}*/

class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            result ^= i ^ nums[i];
        }
        return result;
    }
}

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber(new int[]{3,0,1})); // 2
        System.out.println(new Solution().missingNumber(new int[]{9,6,4,2,3,5,7,0,1})); // 8
    }
}
