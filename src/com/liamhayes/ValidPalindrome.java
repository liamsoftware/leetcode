package com.liamhayes;

import java.util.Arrays;

public class ConcatArray {

    public static void main(String[] args) {
    }
    
    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) builder.append(Character.toLowerCase(ch));
        }
        
        String cleanS = builder.toString();
        String reverseS = builder.reverse().toString();
        
        return cleanS.equals(reverseS);
    }
}
