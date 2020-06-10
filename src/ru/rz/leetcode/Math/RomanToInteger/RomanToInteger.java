package ru.rz.leetcode.Math.RomanToInteger;

class Solution {

    class State {
        public int result;

        public State() {
            this.result = 0;
        }
    }

    int parseGroup(State state, String s, int i, char major, char minor, int mul1, int mul2, char major2, int mul3) {
        int n = s.length();
        int j = i;
        while (j < n && s.charAt(j) == minor)
            ++j;
        if (j == n) {
            state.result += mul2 * (j-i);
            return n;
        }
        if (s.charAt(j) == major) {
            state.result += mul1 - mul2 * (j-i);
            return j + 1;
        } else if (s.charAt(j) == major2) {
            state.result += mul3 - mul2 * (j-i);
            return j + 1;
        }
        else {
            state.result += mul2 * (j-i);
            return j;
        }
    }

    public int romanToInt(String s) {
        int i = 0, n = s.length();
        State state = new State();
        while (i < n) {
            if (s.charAt(i) == 'M') {
                state.result += 1000;
                ++i;
            } else if (s.charAt(i) == 'D') {
                state.result += 500;
                ++i;
            } else if (s.charAt(i) == 'C') {
                i = parseGroup(state, s, i, 'D', 'C', 500, 100, 'M', 1000);
            } else if (s.charAt(i) == 'L') {
                state.result += 50;
                ++i;
            } else if (s.charAt(i) == 'X') {
                i = parseGroup(state, s, i, 'L', 'X', 50, 10, 'C', 100);
            } else if (s.charAt(i) == 'V') {
                state.result += 5;
                ++i;
            } else if (s.charAt(i) == 'I') {
                i = parseGroup(state, s, i, 'V', 'I', 5, 1, 'X', 10);
            }
        }
        return state.result;
    }
}

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
* */

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("III")); // 3
        System.out.println(new Solution().romanToInt("IV")); // 4
        System.out.println(new Solution().romanToInt("IX")); // 9
        System.out.println(new Solution().romanToInt("LVIII")); // 58
        System.out.println(new Solution().romanToInt("MCMXCIV")); // 1994
        System.out.println(new Solution().romanToInt("DCXXI")); // 621

    }
}
