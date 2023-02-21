package org.example.Task2;

import java.util.Arrays;

import static org.example.Task1.RandomNumbersGenerator.generateRandomNumber;
import static org.example.Task2.CheckOfGrow.checkOfGrow;
import static org.example.Task2.CheckOfGrow.printResult;
import static org.example.Task2.CheckOfGrowAlternativeSolution.checkOfGrowAlternativeSolution;

public class RandomNumbersArray2 {
    public static void main(String[] args) {
        int arraySize = 5;
        int[] arrayOfRandomNumbers = new int[arraySize];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = generateRandomNumber();
        }
        System.out.println(Arrays.toString(arrayOfRandomNumbers));
//      checkOfGrowAlternativeSolution(arrayOfRandomNumbers);
        boolean increasingOrder = true;
        printResult(checkOfGrow(increasingOrder, arrayOfRandomNumbers));


    }
}
