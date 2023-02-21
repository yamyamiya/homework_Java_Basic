package org.example.Task2;

public class CheckOfGrowTest {
    public static void main(String[] args) {
        int [] testArray = {3,7,8,15,20};
        boolean increasingOrder = true;
        boolean expectedResult = true;
        boolean actualResult = CheckOfGrow.checkOfGrow(increasingOrder,testArray);
        String message1 = "Test result 1 for CheckofGrow";
        printResult(message1, expectedResult, actualResult);

        int [] testArray2 = {10,7,8,15,20};
        expectedResult = false;
        actualResult = CheckOfGrow.checkOfGrow(increasingOrder,testArray2);
        String message2 = "Test result 2 for CheckofGrow";
        printResult(message2, expectedResult, actualResult);


        int [] testArray3 = {4,7,8,15,10};
        expectedResult = false;
        actualResult = CheckOfGrow.checkOfGrow(increasingOrder,testArray3);
        String message3 = "Test result 3 for CheckofGrow";
        printResult(message3, expectedResult, actualResult);


    }

    public static void printResult(String message, boolean expectedResult, boolean actualResult){
        if (expectedResult == actualResult){
            System.out.println(message + " is OK!");
        } else {
            System.out.println(message + " is FAIL!!!");
            System.out.println("Expected result - " + expectedResult + ", but received " + actualResult);
        }
    }
}
