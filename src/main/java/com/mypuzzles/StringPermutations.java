package com.mypuzzles;

public class StringPermutations {
    // Recursive method to generate permutations
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                // Backtrack to restore the original string for the next iteration
                str = swap(str, l, i);
            }
        }
    }

    // Helper function to swap characters at positions i and j in a string
    public static String swap(String a, int i, int j) {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Permutations of " + str + " are:");
        permute(str, 0, str.length() - 1);
    }
}