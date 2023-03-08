package org.example;

import java.util.Arrays;

public class LotteryTest {

    public static void main(String[] args) {
        Lottery lotTest = new Lottery();

        //        --------Test 1--------

        int[] userNumbers = {22,2,14,18,40};
        lotTest.winningNumbers = new int[]{4,7,22,15,40};
        int[] expectedMatchNumbers = {22,40,0,0,0};
        int[] actualMatchNumbers = lotTest.checkWinningNumbers(userNumbers);
        String message = "Test Result 1 for checkWinningNumbers method if there are matching numbers";
        printTestResult(message,expectedMatchNumbers,actualMatchNumbers);

        //        --------Test 2--------

        lotTest.winningNumbers = new int[]{4,7,33,15,41};
        expectedMatchNumbers = new int[]{0,0,0,0,0};
        actualMatchNumbers = lotTest.checkWinningNumbers(userNumbers);
        message = "Test Result 2 for checkWinningNumbers method if there are no matching numbers";
        printTestResult(message,expectedMatchNumbers,actualMatchNumbers);

    }

    public static void printTestResult(String message, int[] expectedResult, int[] actualResult) {
        if (Arrays.equals(expectedResult,actualResult)) {
            System.out.println(message + " is OK!");
        } else {
            System.out.println(message + " is FAIL!!!");
            System.out.println("Expected result - " + Arrays.toString(expectedResult) + ", but received " + Arrays.toString(actualResult));
        }
    }
}
