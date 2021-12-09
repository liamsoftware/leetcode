package com.liamhayes;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {
        String newS = "";
        boolean found = false;
        for (int i = 0; i < indices.length; i++) {
            found = false;
            for (int j = 0; j < indices.length && !found; j++) {
                if (i == indices[j]) {
                    newS = newS + s.charAt(j);
                    found = true;
                }
            }
        }
        return newS;
    }
}
