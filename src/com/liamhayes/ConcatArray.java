package com.liamhayes;

import java.util.Arrays;

public class ConcatArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] concatArray = new int[nums.length * 2];
        int pointer = 0;
        while (pointer < concatArray.length) {
            for (int i = 0; i < nums.length; i++) {
                concatArray[pointer] = nums[i];
                pointer++;
            }
        }
        return concatArray;
    }
}
