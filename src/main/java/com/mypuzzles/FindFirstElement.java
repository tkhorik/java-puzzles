package com.mypuzzles;

import java.util.HashSet;

public class FindFirstElement {
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 3, 5, 2, 1};
        int firstRepeated = findFirstRepeatedElement(arr);
        if (firstRepeated != -1) {
            System.out.println("First repeated element: " + firstRepeated);
        } else {
            System.out.println("No repeated elements found");
        }
    }

    public static int findFirstRepeatedElement(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; // No repeated elements found
    }
}