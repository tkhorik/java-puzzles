package com.mypuzzles;

import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CountDown {
    public static void main(String[] args) {
        runCounting(10);
    }

    /*
        private static class Counter {
            private static void runCounting(int i) {
                while (i > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Systemsymotion-prefix) .out.println(i);
                    i--;
                }
            }
        }
    */
    private static void runCounting(int i) {
        if (i <= 0) return;
        System.out.println(i);
        CompletableFuture
                .delayedExecutor(1, TimeUnit.SECONDS).execute(()->runCounting(i-1));
    }
}
