package ru.rz.leetcode.Miscellaneous.MinimumAbsoluteDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 1; i < n; ++i) {
            int a = arr[i-1];
            int b = arr[i];
            int diff = b - a;
            if (diff < minDiff) {
                minDiff = diff;
                result = new ArrayList<>();
            }

            if (diff <= minDiff) {
                List<Integer> r = new ArrayList<>();
                r.add(a);
                r.add(b);
                result.add(r);
            }
        }
        return result;
    }
}

public class MinimumAbsoluteDifference {

    static void printList(List<Integer> l) {
        System.out.print('[');
        for (Integer v: l)
            System.out.print(String.format("%d ", v));
        System.out.print(']');
    }

    static void printSolution(List<List<Integer>> result) {
        System.out.print('[');
        for (List<Integer> l: result)
            printList(l);
        System.out.println(']');
    }

    public static void main(String[] args) {
        printSolution(new Solution().minimumAbsDifference(new int[] {4,2,1,3})); // [[1,2],[2,3],[3,4]]
        printSolution(new Solution().minimumAbsDifference(new int[] {1,3,6,10,15})); // [[1,3]]
        printSolution(new Solution().minimumAbsDifference(new int[] {3,8,-10,23,19,-4,-14,27})); // [[-14,-10],[19,23],[23,27]]
    }
}
