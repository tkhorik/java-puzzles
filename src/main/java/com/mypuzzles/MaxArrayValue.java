package com.mypuzzles;

public class MaxArrayValue {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 356, 5, 35, 3};
        int[] arr2 = {3, 5, 2, 1111, 55, 2, 3};
        System.out.println(maxValueFromTwoArrays(arr1, arr2));
    }

    private static int maxValueFromTwoArrays(int[] arr1, int[] arr2) {
        int max1 = arr1[0];
        int max2 = arr2[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max1) max1 = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max2) max2 = arr2[i];
        }
        return max1 > max2 ? max1 : max2;
    }
}

//    public static int maxIntInTwoArrays(int[] arr1, int[] arr2) {
//        int max1 = arr1[0];
//        int max2 = arr2[0];
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] > max1) max1 = arr1[i];
//        }
//        for (int i = 1; i < arr2.length; i++) {
//            if (arr2[i] > max2) max2 = arr2[i];
//        }
//        return max2 > max1 ? max2 : max1;
//    }
//}