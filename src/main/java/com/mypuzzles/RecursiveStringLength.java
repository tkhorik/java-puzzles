package com.mypuzzles;

public class RecursiveStringLength {
    // Recursive method that returns the length of a string
    public static int recLength(String str) {
        // Base condition: empty string returns 0
        if (str.equals("")) {
            return 0;
        }
        // Recursive call on substring starting at index 1 plus one for the current character
        return 1 + recLength(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "Prepinsta";
        System.out.println("Length of '" + str + "' is: " + recLength(str));
    }
}
