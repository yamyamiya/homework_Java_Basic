package org.example.Task1;

public class Task1Test {
    public static void main(String[] args) {

        //        --------Test 1--------

        int[] testArray1 = {1, 2, 3, 5};
        String message1 = "Test Result for findMissingElement method for sorted array";
        int expectedMissingElement = 4;
        int actualMissingElement = SearchOfMissingElementUtil.findMissingElement(testArray1);
        Print.printTestResult(message1, expectedMissingElement, actualMissingElement);

        //        --------Test 2--------
        int[] testArray2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        String message2 = "Test Result for findMissingElement method for unsorted array";
        expectedMissingElement = 9;
        actualMissingElement = SearchOfMissingElementUtil.findMissingElement(testArray2);
        Print.printTestResult(message2, expectedMissingElement, actualMissingElement);


    }
}
