package com.mypuzzles;

import java.util.concurrent.*;

public class CounterWithCompatableFuture {

    public static void main(String[] args) {
//        runCounting(30); // count from 5 down
        Counter.runCounting(5);
    }

    private static void runCounting(int i) {
        if (i <= 0) return; // base case: stop when zero

        System.out.println(i);

        // schedule next step after 1 second (non-blocking)
        CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS).execute(() -> runCounting(i - 1));
        System.out.println(i);
    }

    private static class Counter {
        private static final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        private static void runCounting(int start) {
            for (int i = start; i > 0; i--) {
                int num = i;
                scheduler.schedule(() -> System.out.println(num), start - i, // delay in seconds
                        TimeUnit.SECONDS);
            }
            scheduler.schedule(scheduler::shutdown, start, TimeUnit.SECONDS);
        }
    }
}
