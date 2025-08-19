package com.mypuzzles;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class TheLast {
    public static void main(String[] args) {
        int[] numbs = {4, 5, 1, 2, 0, 4, 5, 2};
        firstNotDoubled(numbs);
    }

    private static int firstNotDoubled(int[] nums) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }
        return -1; //if we have no unique value;
    }
}

