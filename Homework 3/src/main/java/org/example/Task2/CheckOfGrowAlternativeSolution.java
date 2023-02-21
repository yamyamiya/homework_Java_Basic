package org.example.Task2;
//альтернативный метод
public class CheckOfGrowAlternativeSolution {

    public static void checkOfGrowAlternativeSolution(int[] arrayOfRandomNumbers) {


        int minNumber = arrayOfRandomNumbers[0];
        for (int i = 1; i < arrayOfRandomNumbers.length; i++) {
            if (arrayOfRandomNumbers[i] > minNumber) {
                minNumber = arrayOfRandomNumbers[i];
                if (i == arrayOfRandomNumbers.length - 1) {
                    System.out.println("Your array numbers ARE placed in the increasing order.");
                }
            } else if (arrayOfRandomNumbers[i] <= minNumber) {
                System.out.println("Your array numbers ARE NOT placed in the increasing order.");
                break;
            }

        }
    }
}