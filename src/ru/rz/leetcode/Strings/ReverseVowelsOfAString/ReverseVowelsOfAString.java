package ru.rz.leetcode.Strings.ReverseVowelsOfAString;

class Solution {

    boolean[] arr;

    public Solution() {
        arr = new boolean[256];
        arr['a'] = true;
        arr['e'] = true;
        arr['i'] = true;
        arr['o'] = true;
        arr['u'] = true;
        arr['A'] = true;
        arr['E'] = true;
        arr['I'] = true;
        arr['O'] = true;
        arr['U'] = true;
    }

    boolean isVowel(char c) {
        //return "aeiou".indexOf(c) != -1;
        /*return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';*/
        return arr[c];
    }

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();
        int i = 0, j = n-1;

        while (i < j) {
            //while (!isVowel(/*Character.toLowerCase*/(chars[i])) && i < j)
            while (!arr[chars[i]] && i < j)
                ++i;

            if (i >= j)
                break;

            //while (!isVowel(/*Character.toLowerCase*/(chars[j])) && i < j)
            while (!arr[chars[j]] && i < j)
                --j;

            if (i >= j)
                break;

            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            ++i; --j;
        }

        return new String(chars);
    }
}

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseVowels("hello")); // "holle"
        System.out.println(new Solution().reverseVowels("leetcode")); // "leotcede"
        System.out.println(new Solution().reverseVowels("bbbb")); // "bbbb"
    }
}
