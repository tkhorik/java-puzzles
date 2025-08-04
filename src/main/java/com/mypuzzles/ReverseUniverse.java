package com.mypuzzles;

import java.util.concurrent.atomic.AtomicReference;

public class ReverseUniverse {
    public static void main(String[] args) {
        AtomicReference<String> javaReversed = new AtomicReference<>("hello world and show must go on d");
        System.out.println(new StringBuilder(javaReversed.get()).reverse().toString());
    }
}
