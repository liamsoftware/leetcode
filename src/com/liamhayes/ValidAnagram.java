package com.liamhayes;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        //store all chars and counts from s in a map
        //go though t and reduce counts and for each char
        //return false if you cannot find t's letters or has no counts

        Map<Character, Integer> counts = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char aChar = s.charAt(i);
            int aCount = counts.getOrDefault(aChar, 0);
            counts.put(aChar, aCount + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char aChar = t.charAt(i);
            if (counts.containsKey(aChar) && counts.get(aChar) > 0) {
                int updatedCount = counts.get(aChar) - 1;
                counts.put(aChar, updatedCount);
            } else return false;
        }

        return true;
    }

    //study users answer where they store the chars in an array:
    /*
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
     */
}
