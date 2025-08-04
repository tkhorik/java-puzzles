package com.gpt.twosum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 5, 3, 2, 1};
        int target = 5;

        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
    }
}
