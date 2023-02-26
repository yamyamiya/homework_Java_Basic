package org.example.Task1;

import java.util.Arrays;

public class Print {
    public static void printArray(String message, int[] array) {
        System.out.println(message + Arrays.toString(array));
    }

    public static void printResult(String message, int missingElement) {
        System.out.println(message + missingElement);
    }

    public static void printTestResult(String message, int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(message + " is OK!");
        } else {
            System.out.println(message + " is FAIL!!!");
            System.out.println("Expected result - " + expectedResult + ", but received " + actualResult);
        }
    }
}

