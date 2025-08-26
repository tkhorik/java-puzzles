package com.mypuzzles;

import java.util.concurrent.atomic.AtomicReference;

public class ReverseUniverse {
    public static void main(String[] args) {
        AtomicReference<String> javaReversed = new AtomicReference<>("hello world and show must go on d");
        System.out.println(new StringBuilder(javaReversed.get()).reverse().toString());
        System.out.println(myReversedStringRealization("hollo my friends"));
    }

    private static String myReversedStringRealization(String s) {
        int[] cps = s.codePoints().toArray();
        for (int i = 0, j = cps.length - 1; i < j; i++, j--) {
            int temp = cps[i];
            cps[i] = cps[j];
            cps[j] = temp;
        }
        return new String(cps,0, cps.length );
    }
}
//public static String reverseByCodePoints(String s) {
//    int[] cps = s.codePoints().toArray();  // O(n) code points
//    // reverse code points
//    for (int i = 0, j = cps.length - 1; i < j; i++, j--) {
//        int tmp = cps[i]; cps[i] = cps[j]; cps[j] = tmp;
//    }
//    return new String(cps, 0, cps.length);
//}