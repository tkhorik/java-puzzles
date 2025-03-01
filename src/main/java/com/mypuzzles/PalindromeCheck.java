package com.mypuzzles;

public class PalindromeCheck {
    // Method to determine if the input string is a palindrome
    public static boolean isPalindrome(String str) {
        String reverseStr = "";
        int len = str.length();
        // Reverse the string using a for loop
        for (int i = len - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        // Compare ignoring case differences
        return str.equalsIgnoreCase(reverseStr);
    }

    public static void main(String[] args) {
        String testStr = "Radar";
        if(isPalindrome(testStr)) {
            System.out.println(testStr + " is a palindrome.");
        } else {
            System.out.println(testStr + " is not a palindrome.");
        }
    }
}
