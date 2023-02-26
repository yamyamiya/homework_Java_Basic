package org.example.Task2;

import org.example.Task1.Print;

public class Task2Test {
    static int k1 = 6;
    static int k2 = 2;

    public static void main(String[] args) {
        //        --------Test 1--------

        int[] testArray1 = {1, 5, 7, 1};
        String message = "Test Result 1 for counterOfPairs method";
        int expectedNumberOfPairs = 2;
        int actualNumberOfPairs = CounterOfPairs.counterOfPairs(testArray1, k1);
        Print.printTestResult(message, expectedNumberOfPairs, actualNumberOfPairs);

        //        --------Test 2--------
        int[] testArray2 = {1, 1, 1, 1};
        message = "Test Result 2 for counterOfPairs method";
        expectedNumberOfPairs = 6;
        actualNumberOfPairs = CounterOfPairs.counterOfPairs(testArray2, k2);
        Print.printTestResult(message, expectedNumberOfPairs, actualNumberOfPairs);


    }
}
