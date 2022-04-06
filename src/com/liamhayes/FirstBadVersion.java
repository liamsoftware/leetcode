package com.liamhayes;

public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        int pivot, left = 0, right = n;
        while (left < right) {
            pivot = left + (right - left)/2;
            if (isBadVersion(pivot)) right = pivot;
            else left = pivot + 1;
        }
        return left;
    }

    private static boolean isBadVersion(int n) {
        if (n >= 4) return true;
        return false;
    }
}
