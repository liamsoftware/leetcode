package com.liamhayes.algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 7, 10};
        System.out.println(search(nums, 11));
    }

    public static int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + ((right - left) / 2);
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }
}
