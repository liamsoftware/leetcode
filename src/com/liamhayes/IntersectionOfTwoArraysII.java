package com.liamhayes;


import java.util.*;

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect2(nums1, nums2)));
    }

    public static int[] intersect2(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) map.put(nums1[1], map.get(nums1[i]) + 1);
            else map.put(nums1[i], 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        //how to do this?
        //loop through each num in each array and find match?
        StringBuilder n = new StringBuilder();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                //if (i != j) {
                    System.out.println(nums1[i] + ":" + nums2[j]);
                    if (nums1[i] == nums2[j]) {
                        n.append(nums1[i]).append(",");
                    }
                //}
            }
        }
        System.out.println("n=>" + n);
        String ns = n + "";
        String[] s = ns.split(",");
        System.out.println(Arrays.toString(s));
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        return arr;
    }
}
