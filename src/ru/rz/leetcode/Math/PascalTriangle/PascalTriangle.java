package ru.rz.leetcode.Math.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

/*
* 1
* 1 1
* 1 2 1
* 1 3 3 1
* 1 4 6 4 1
*
* */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lines = new ArrayList<List<Integer>>();
        if (0 == numRows)
            return lines;
        ArrayList<Integer> prevLine = new ArrayList<Integer>();
        prevLine.add(1);
        lines.add(prevLine);
        for (int i = 1; i < numRows; ++i) {
            ArrayList<Integer> currLine = new ArrayList<Integer>();
            currLine.add(1);
            for (int j = 1; j < prevLine.size(); ++j) {
                currLine.add(prevLine.get(j-1) + prevLine.get(j));
            }
            currLine.add(1);
            lines.add(currLine);
            prevLine = currLine;
        }

        return lines;
    }
}

public class PascalTriangle {

    static void printTriangle(List<List<Integer>> lines) {
        for (List<Integer> line: lines) {
            for (Integer v: line) {
                System.out.print(String.format("%d ", v));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(new Solution().generate(5));
    }
}
