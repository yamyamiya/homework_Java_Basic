package org.example.Task4;

import static org.example.Task2.RandomNumbersGenerator.generateRandomNumber;

public class NewArray {
    private int arraySize;

    public NewArray(int arraySize) {
        this.arraySize = arraySize;
    }

    public int[] createArray(){
        int[] arrayOfRandomNumbers = new int[arraySize];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = generateRandomNumber();
        }
        return arrayOfRandomNumbers;
    }


}
