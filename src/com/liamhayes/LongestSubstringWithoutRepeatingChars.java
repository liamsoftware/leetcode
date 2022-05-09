package com.liamhayes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }


    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, len = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) >= start) {
                    start = map.get(c) + 1;
                }
            }
            len = Math.max(len, i - start + 1);
            map.put(c, i);
        }
        return len;
    }

    //sliding window better solution.
    public static int findLengthOfLongestRepeatingChars(String s) {
        int left = 0, right = 0, result = 0;

        Set<Character> window = new HashSet<>();

        while (right < s.length()) {
            if (!window.contains(s.charAt(right))) {
                window.add(s.charAt(right));
                right++;
            } else {
                window.remove(s.charAt(left));
                left++;
            }
            result = Math.max(result, right - left);
        }
        return result;
    }
}
