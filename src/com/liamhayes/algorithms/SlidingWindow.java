package com.liamhayes.algorithms;

public class SlidingWindow {

    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/window-sliding-technique/
        //https://www.youtube.com/watch?v=MK-NZ4hN7rs

        int[] arr = {3, 4, 1, 4, 5};
        int arrLength = arr.length;
        int subArraySize = 2;
        System.out.println(maxSum(arr, arrLength, subArraySize));
    }

    public static int maxSum(int[] arr, int arrayLength, int subArraySize) {
        if (arrayLength < subArraySize) return -1;
        int maxSum = 0;
        for (int i = 0; i < subArraySize; i++) maxSum += arr[i];
        int windowSum = maxSum;
        for (int i = subArraySize; i < arrayLength; i++) {
            windowSum += arr[i] - arr[i - subArraySize];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}
