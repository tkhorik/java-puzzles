package com.mypuzzles;

public class MaxArrayValue {
    public static void main(String[] args) {
        Integer arr1[] = {1, 1, 2, null, 5, null, 2, null, 1, 1, 5, 3, 2, 1};
        Integer arr2[] = {2, 33, 5, 1, 22};
        System.out.println(showHighestArrayValue(arr1, arr2));
    }

    private static int showHighestArrayValue(Integer[] arr1, Integer[] arr2) {
        int max1 = arr1[0];
        int max2 = arr2[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==null) arr1[i] =0;
            if (max1 < arr1[i]) {
                max1 = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i]==null) arr1[i] =0;
            if (max2 < arr2[i]) max2 = arr2[i];
        }
        return Math.max(max1, max2);
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