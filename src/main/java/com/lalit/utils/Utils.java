package com.lalit.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Utils {

    public static <T> void validateOutput(T actual, T expected) {
        if (actual instanceof int[]) {
            String arrayString = Arrays.stream((int[]) actual).mapToObj(String::valueOf).collect(Collectors.joining(", "));
            System.out.printf("Validation succeeded: Expected and Actual is [%s].%n", arrayString);
        } else if (!actual.equals(expected)) {
            System.err.printf("Validation failed: Expected %s but got %s.%n", expected, actual);
        } else {
            System.out.printf("Validation succeeded: Expected and Actual is %s.%n", actual);
        }
    }

}
