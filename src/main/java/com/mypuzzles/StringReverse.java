package com.mypuzzles;

public class StringReverse {
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(StringReverse.reverse("this is the string"));
    }
}
// this is the simple ide for codding and without helpers autocomplete and etc.