package com.mypuzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class FizzBuzz {

    public static String pringFizzBuzz(int i) {
//            if (i % 15 == 0) {
        if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println("FizzBuzz");
            return "FizzBuzz";
        } else if (i % 3 == 0) {
//                    System.out.println("Fizz");
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
//                    System.out.println("Buzz");
        } else {
            return String.valueOf(i);
//                    System.out.println(i);
//            return "hello";
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
//            System.out.println(pringFizzBuzz(i));
            System.out.println(fizzBuzz(i));
        }
    }

    private static String fizzBuzz(int i) {
        String replay = "heeelll yeeaa!";
        System.out.println(i);
        if (i % 3 == 0 && i % 5 == 0) {
            return replay;
        }
        else return "yuppy!";
    }
}

class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        assertEquals("Fizz", FizzBuzz.pringFizzBuzz(3));
        assertEquals("Buzz", FizzBuzz.pringFizzBuzz (5));
        assertEquals("FizzBuzz", FizzBuzz.pringFizzBuzz (15));
        assertEquals("7", FizzBuzz.pringFizzBuzz(7));
    }}
