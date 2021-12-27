package com.liamhayes;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        //store all chars and counts from magazine in map
        //for each char in ransome, go to map and if there decrement count.

        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char aChar = magazine.charAt(i);
            int count = counts.getOrDefault(aChar, 0);
            counts.put(aChar, count + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char aChar = ransomNote.charAt(i);
            if (counts.containsKey(aChar) && counts.get(aChar) > 0) {
                counts.put(aChar, counts.get(aChar) - 1);
            } else return false;
        }
        return true;
    }
}
