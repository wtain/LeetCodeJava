package ru.rz.leetcode.Arrays.TwoSum;

import java.util.HashMap;
import java.util.Map;

/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Pair<Integer, Integer>[] arr = new Pair[n];
        for (int i = 0; i < n; ++i)
            arr[i] = new Pair(nums[i], i);

        Arrays.sort(arr, Comparator.comparingInt(Pair::getKey));

        for (int i = 0; i < n-1; ++i)
        {
            int t = target - arr[i].getKey();
            Pair<Integer, Integer> Target = new Pair(t, -1);
            int index = Arrays.binarySearch(arr, i+1, n, Target, Comparator.comparingInt(Pair::getKey));
            if (index >= 0)
                return new int[] {arr[i].getValue(), arr[index].getValue()};
        }
        return null;
    }
}*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int t = target - nums[i];
            if (map.containsKey(t))
                return new int[] {map.get(t), i};
            map.put(nums[i], i);
        }
        return null;
    }
}

public class TwoSum {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(String.format("%d ", arr[i]));
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)); // 0 1
        printArray(new Solution().twoSum(new int[]{3, 2, 4}, 6)); // 1 2
    }
}
