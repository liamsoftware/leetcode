package com.liamhayes;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {5, 6, 1, -10, 1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE, sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum > max) max = sum;
                if (sum < 0) sum = 0;
            }
            return max;
    }
}
