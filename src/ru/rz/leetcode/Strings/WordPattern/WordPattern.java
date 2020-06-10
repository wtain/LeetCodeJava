package ru.rz.leetcode.Strings.WordPattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Solution {

    class WordIterator implements Iterator<String> {

        String str;
        int ni;

        WordIterator(String str) {
            this.str = str;
            this.ni = 0;
        }

        @Override
        public boolean hasNext() {
            return ni < str.length();
        }

        @Override
        public String next() {
            StringBuilder sb = new StringBuilder();
            while (ni < str.length() && str.charAt(ni) != ' ') {
                sb.append(str.charAt(ni++));
            }
            if (ni < str.length())
                ++ni;
            return sb.toString();
        }
    }

    public boolean wordPattern(String pattern, String str) {
        WordIterator wi = new WordIterator(str);
        int i = 0, n = pattern.length();

        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> words = new HashSet<>();

        while (i < n && wi.hasNext()) {
            char pi = pattern.charAt(i++);
            String w = wi.next();
            if (charToWord.containsKey(pi)) {
                if (!charToWord.get(pi).equals(w))
                    return false;
            } else {
                if (words.contains(w))
                    return false;
                charToWord.put(pi, w);
                words.add(w);
            }
        }

        return i >= n && !wi.hasNext();
    }
}

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(new Solution().wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(new Solution().wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(new Solution().wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(new Solution().wordPattern("abba", "dog dog dog dog")); // false
    }
}
