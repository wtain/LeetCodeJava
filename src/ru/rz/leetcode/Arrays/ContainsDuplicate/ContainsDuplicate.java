package ru.rz.leetcode.Arrays.ContainsDuplicate;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (seen.contains(nums[i]))
                return true;
            seen.add(nums[i]);
        }
        return false;
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(new Solution().containsDuplicate(new int[] {1,2,3,1})); // true
        System.out.println(new Solution().containsDuplicate(new int[] {1,2,3,4})); // false
        System.out.println(new Solution().containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2})); // true
    }
}
