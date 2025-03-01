package com.mypuzzles;

public class StringReverse {
    public static String reverse(String input) {
        // Using StringBuilder's in-built reverse() method
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Independent";
        String reversed = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
