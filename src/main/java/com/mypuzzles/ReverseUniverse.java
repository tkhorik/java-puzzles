package com.mypuzzles;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class ReverseUniverse {
    public static void main(String[] args) {
        AtomicReference<String> javaReversed = new AtomicReference<>("hello world and show must go on d");
        System.out.println(new StringBuilder(javaReversed.get()).reverse().toString());
        System.out.println(myReversedStringRealization("hollo my friends"));
    }

    private static String myReversedStringRealization(String s) {
        int[] cps = s.codePoints().toArray();

        Map <Integer,Integer> map = new HashMap<>( );
        map.put(null,1);
        for (var entry : map.entrySet()) {
//            String.valueOf(null) returns the literal string "null", not a crash.
            System.out.println(entry.getKey() +" "+ String.valueOf(entry.getValue()));

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        for (int i = 0, j = cps.length - 1; i < j; i++, j--) {
            int temp = cps[i];
            cps[i] = cps[j];
            cps[j] = temp;
        }
        return new String(cps,0, cps.length );
    }
}