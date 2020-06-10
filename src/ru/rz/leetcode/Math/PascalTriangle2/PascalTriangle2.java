package ru.rz.leetcode.Math.PascalTriangle2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> prevLine = new ArrayList<Integer>();
        prevLine.add(1);
        for (int i = 0; i < rowIndex; ++i) {
            ArrayList<Integer> currLine = new ArrayList<Integer>();
            currLine.add(1);
            for (int j = 1; j < prevLine.size(); ++j) {
                currLine.add(prevLine.get(j-1) + prevLine.get(j));
            }
            currLine.add(1);
            prevLine = currLine;
        }

        return prevLine;
    }
}

public class PascalTriangle2 {

    static void printRow(List<Integer> row) {
        for (Integer v: row)
            System.out.print(String.format("%d ", v));
        System.out.println();
    }

    public static void main(String[] args) {
        printRow(new Solution().getRow(3)); // [1,3,3,1]
    }
}
