package com.liamhayes.algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 7, 10};
        System.out.println(search(nums, 11));
    }

    public static int search(int[] nums, int target) {
        int mid, left = 0, right = nums.length - 1;
        while (left <= right) {
            mid = left + ((right - left) / 2);
            if (nums[mid] == target) return mid;
            if (target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
