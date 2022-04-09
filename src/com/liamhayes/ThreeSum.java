package com.liamhayes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] n = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(n));
    }

    //Sort the array
    //Iterate for all less than zero
    //If not the same as prev, then call two sum

    //Have low and high pointers
    //loop
    //find triplet sum
    //if s < 0 -> increment low
    //if s > 0 -> decrement high
    //else it is zer
    //add to result, increment low, decrement high
    //make sure new val is not the same, skip if it is to avoid duplicates

    public static List<List<Integer>> threeSum(int[] n) {
        Arrays.sort(n);
        List<List<Integer>> r = new ArrayList<>();
        for (int i = 0; i < n.length && n[i] <= 0; i++)
            if (i == 0 || n[i] != n[i - 1])
                twoSum2(n, i, r);
        return r;
    }

    private static void twoSum2(int[] n, int i, List<List<Integer>> r) {
        int l = i +1, h = n.length -1;
        while (l < h) {
            int s = n[i] + n[l] + n[h];
            if (s < 0) l++;
            else if (s > 0) h--;
            else {
                r.add(Arrays.asList(n[i], n[l], n[h]));
                l++;
                h--;
                while (l < h && n[l] == n[l-1]) l++;
            }
        }
    }
























}
