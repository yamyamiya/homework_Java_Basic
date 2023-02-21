package org.example.Task1;

import java.util.Arrays;

import static org.example.Task1.RandomNumbersGenerator.generateRandomNumber;

public class RandomNumbersArray {
    public static void main(String[] args) {
        int arraySize = 8;
        int[] arrayOfRandomNumbers = new int[arraySize];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = generateRandomNumber();
        }
        System.out.println(Arrays.toString(arrayOfRandomNumbers));

        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (i % 2 != 0) {
                arrayOfRandomNumbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayOfRandomNumbers));
    }
}