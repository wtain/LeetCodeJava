package ru.rz.leetcode.Arrays.ContainsDuplicate2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> nearbyNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (nearbyNumbers.containsKey(nums[i]))
                if (i - nearbyNumbers.get(nums[i]) <= k)
                    return true;

            nearbyNumbers.put(nums[i], i);
        }
        return false;
    }
}

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        System.out.println(new Solution().containsNearbyDuplicate(new int[]{1,2,3,1}, 3)); // true
        System.out.println(new Solution().containsNearbyDuplicate(new int[]{1,0,1,1}, 1)); // true
        System.out.println(new Solution().containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2)); // false

    }
}
