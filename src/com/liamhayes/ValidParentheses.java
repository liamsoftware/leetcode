package com.liamhayes;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("([()])"));
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> right = new HashMap<>();
        right.put(')', '(');
        right.put(']', '[');
        right.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (right.containsKey(ch)) {
                if (stack.isEmpty()) return false;
                Character lastEntry = stack.pop();
                if (lastEntry != right.get(ch)) return false;
            } else stack.push(ch);
        }
        return stack.isEmpty();
    }

}
