package com.liamhayes;

import java.util.Arrays;

public class RunningSum1DArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] runningSums = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            runningSums[i] = sum;
        }

        return runningSums;
    }
}
