package com.lalit.utils;

public class Utils {
    public static void validateOutPut(int actual, int expected) {
        if (actual != expected) {
            System.err.printf("Validation failed: Expected %d but got %d.%n", expected, actual);
        } else {
            System.out.printf("Validation succeeded: Expected & Actual is %d.%n", actual);
        }
    }
}
