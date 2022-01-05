package com.liamhayes.algorithms;

public class TwoPointer {

    public static void main(String[] args) {
        //given a sorted array of ints, return if there is a pair summing to the target
        int[] arr = {2, 3, 5, 8, 9, 10, 11};
        int target = 12;
        System.out.println(isPairSum(arr, target));
        System.out.println(isPairSum2(arr, target));
    }

    //brute force, time complexity is O(n2) because of the nested for loop
    public static int isPairSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == target) return 1;
                    if (arr[i] + arr[j] > target) return 0;
                }
            }
        }
        return 0;
    }

    //two pointers, time complexity is O(n) because of one iteration through the array
    public static int isPairSum2(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) return 1;
            else if (sum < target) i++;
            else j--;
        }
        return 0;
    }
}
