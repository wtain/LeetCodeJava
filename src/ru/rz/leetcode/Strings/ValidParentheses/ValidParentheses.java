package ru.rz.leetcode.Strings.ValidParentheses;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Stack;

class Solution {

    boolean isOpenBracket(char c) {
        return "{([".indexOf(c) >= 0;
    }

    static HashMap<Character, Character> brackets;

    char getOpenBracket(char c) {
        if (null == brackets) {
            brackets = new HashMap<Character, Character>();
            brackets.put(')', '(');
            brackets.put(']', '[');
            brackets.put('}', '{');
        }
        return brackets.get(c);
    }

    public boolean isValid(String s) {
        Stack<Pair<Character, Integer>> st = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (isOpenBracket(c)) {
                if (st.empty() || st.peek().getKey() != c)
                    st.push(new Pair<>(c, 1));
                else {
                    Pair<Character, Integer> t = st.pop();
                    st.push(new Pair<>(t.getKey(), t.getValue()+1));
                }
            } else {
                char o = getOpenBracket(c);
                if (st.isEmpty() || st.peek().getKey() != o)
                    return false;
                else {
                    Pair<Character, Integer> t = st.pop();
                    if (t.getValue() > 1)
                        st.push(new Pair<>(t.getKey(), t.getValue()-1));
                }
            }
        }
        return st.isEmpty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()")); // true
        System.out.println(new Solution().isValid("()[]{}")); // true
        System.out.println(new Solution().isValid("(]")); // false
        System.out.println(new Solution().isValid("([)]")); // false
        System.out.println(new Solution().isValid("{[]}")); // true

    }
}
