package com.mypuzzles;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 7, 3, 1, 5};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
