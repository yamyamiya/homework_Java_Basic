package org.example.Task2;

public class CheckOfGrow {
    public static boolean checkOfGrow(boolean increasingOrder, int[] arrayOfRandomNumbers){
        for (int i = 1; i < arrayOfRandomNumbers.length; i++) {
            int currentNumber = arrayOfRandomNumbers[i];
            int previousNumber = arrayOfRandomNumbers[i - 1];
            if (currentNumber < previousNumber) {
                increasingOrder = false;
            }
        }

        return increasingOrder;
    }

    public static void printResult(boolean increasingOrder){
        if (increasingOrder) {
            System.out.println("Your array numbers ARE placed in the increasing order.");
        } else {
            System.out.println("Your array numbers ARE NOT placed in the increasing order.");
        }
    }

    }



