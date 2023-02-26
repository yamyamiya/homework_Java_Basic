package org.example.Task1;

import org.example.Task2.UserInput;

public class CreationOfArrayOfWholeNumbersUtil {

    int lengthOfArray;
    int indexOfMissingElement;
    int[] linearArray;
    int[] arrayWithMissingElement;


    public int[] creationOfArray() {
        lengthOfArray = UserInput.userInput("Please enter the length of your array:");
        linearArray = new int[lengthOfArray + 1];
        indexOfMissingElement = (int) (Math.random() * (lengthOfArray - 1) + 1);
        fillLinearArray(linearArray);
        return arrayWithMissingElement = fillNotLinearArray(linearArray);

    }

    public void fillLinearArray(int[] linearArray) {
        for (int i = 0; i < linearArray.length; i++) {
            linearArray[i] = i + 1;
        }

    }

    public int[] fillNotLinearArray(int[] linearArray) {
        int[] arrayWithMissingElement = new int[linearArray.length - 1];
        for (int i = 0; i < indexOfMissingElement; i++) {
            arrayWithMissingElement[i] = linearArray[i];
        }
        for (int i = indexOfMissingElement; i < arrayWithMissingElement.length; i++) {
            arrayWithMissingElement[i] = linearArray[i + 1];
        }

        return arrayWithMissingElement;

    }

    public int[] shuffleArray(int[] arrayWithMissingElement) {

        int[] shuffleArray = arrayWithMissingElement.clone();

        for (int i = shuffleArray.length - 1; i > 1; i--) {
            int j = (int) (Math.random() * i);

            int temp = shuffleArray[i];
            shuffleArray[i] = shuffleArray[j];
            shuffleArray[j] = temp;

        }
        return shuffleArray;
    }


}
