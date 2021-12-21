package com.liamhayes;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = nums1.length - 1;
        int end1 = m-1;
        int end2 = n-1;

        while (end2 >= 0) {
            if (end1 >= 0) {
                nums1[end--] = nums1[end1] > nums2[end2] ? nums1[end1--] : nums2[end2--];
            } else nums1[end--] = nums2[end2--];
        }
    }
}
