package com.mypuzzles;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10; // number of terms to generate
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Sequence: " + num1);
        if (n > 1) {
            System.out.print(", " + num2);
        }
        // Loop to calculate the next terms
        for (int i = 3; i <= n; i++) {
            int nextNum = num1 + num2;
            System.out.print(", " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
        System.out.println();
    }
}