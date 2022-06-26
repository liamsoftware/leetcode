package com.liamhayes;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargestElement {

    public static void main(String[] args) {

        int[] nums = {3,2,3,1,2,4,5,5,6,3,6};
        System.out.println(findKthLargest(nums, 4));

    }

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(n -> n));

        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                int polled = heap.poll();
                System.out.println(heap);
                System.out.println("removed: " + polled);
            }
        }

        return heap.poll();
    }

}