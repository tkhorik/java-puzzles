package com.mypuzzles;

import java.util.Arrays;

public class LargestElement {
//    public static int findLargest(int[] arr) {
//
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    /**
     * Here are common time complexities ordered from fastest to slowest (speed means less growth in time):
     * O(1) — Constant time (fastest)
     * O(log n) — Logarithmic time
     * O(n) — Linear time
     * O(n log n) — Linearithmic time
     * O(n²) — Quadratic time
     * O(n³) — Cubic time
     * O(2^n) — Exponential time
     * O(n!) — Factorial time (slowest)
     */
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 22, 2};
        System.out.println(findLargest(arr)); // Output: 9
    }

    private static int findLargest(int[] arr) {
         int max = Arrays.stream(arr).max().orElseThrow();
         return max;
    }

}
