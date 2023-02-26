package org.example.Task2;

public class CreationOfArrayUtil {
    int[] array;
    int arrayLength;

    public int[] creationOfArray() {
        arrayLength = UserInput.userInput("Please enter the length of your array:");
        array = new int[arrayLength];
        fillArray(array);
        return array;
    }

    public void fillArray(int[] linearArray) {
        for (int i = 0; i < linearArray.length; i++) {
            linearArray[i] = randomNumber(10,1);
        }

    }

    public int randomNumber(int maxNumber, int minNumber) {
        return (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber);
    }


}

