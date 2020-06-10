package ru.rz.leetcode.DynamicProgramming.RangeSumQueryImmutable;

class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        int n = nums.length;
        if (0 == n)
            return;
        sums = new int[n];
        sums[0] = nums[0];
        for (int i = 1; i < n; ++i)
            sums[i] = sums[i-1] + nums[i];
    }

    public int sumRange(int i, int j) {
        int sum = sums[j];
        if (i > 0)
            sum -= sums[i-1];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        {
            NumArray arr = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
            System.out.println(arr.sumRange(0, 2)); //  1
            System.out.println(arr.sumRange(2, 5)); // -1
            System.out.println(arr.sumRange(0, 5)); // -3
        }
        {
            NumArray arr = new NumArray(new int[0]);
        }
    }
}
