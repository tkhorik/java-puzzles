package com.mypuzzles;

public class Singleton {
    // Private static variable for holding the single instance
    private static Singleton singleInstance = null;

    // Private constructor to prevent external instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Public method to retrieve the single instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // Both instance1 and instance2 should point to the same object
        if (instance1 == instance2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
