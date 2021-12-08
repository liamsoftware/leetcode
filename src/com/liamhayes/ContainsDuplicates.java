package com.liamhayes;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> tracker = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (tracker.contains(nums[i])) {
                return true;
            }
            tracker.add(nums[i]);
        }
        return false;
    }
}
