package org.example.Task4;

import java.util.Arrays;

import static org.example.Task2.RandomNumbersGenerator.generateRandomNumber;

public class AdditionalFunctionArray {
    public static void main(String[] args) {
       int[] arrayOfRandomNumbers =  new NewArray(30).createArray();


        System.out.println(Arrays.toString(arrayOfRandomNumbers));
        findMaxMethod(arrayOfRandomNumbers, true);
        findMinMethod(arrayOfRandomNumbers, true);
        findArithmeticMeanMethod(arrayOfRandomNumbers, true);
        findDifferenceBetweenIndexesOfMaxAndMinNumbersMethod(arrayOfRandomNumbers, true);
        findFirstPrimeNumbersMethod(arrayOfRandomNumbers, true);
        findLastPrimeNumbersMethod(arrayOfRandomNumbers, true);
        primeNumbersCountMethod(arrayOfRandomNumbers, true);
    }

    public static int findMaxMethod(int[] array, boolean printResult) {
        int maximumNumber = 1;
        int maximumNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximumNumber) {
                maximumNumber = array[i];
                maximumNumberIndex = i;
            }
        }
        if(printResult) {
            System.out.println("Maximum number in your array is: " + maximumNumber + ", with index: " + maximumNumberIndex);
        }
        return maximumNumber;
    }

    public static int findMinMethod(int[] array, boolean printResult) {
        int minimumNumber = 99;
        int minimumNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimumNumber) {
                minimumNumber = array[i];
                minimumNumberIndex = i;

            }
        }
        if(printResult) {
            System.out.println("Minimum number in your array is: " + minimumNumber + ", with index: " + minimumNumberIndex);
        }
        return minimumNumber;
    }

    public static int findArithmeticMeanMethod(int[] array, boolean printResult) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        if(printResult) {
            System.out.println("Arithmetic Mean of members in your array is: " + sum / array.length);
        }
        return sum / array.length;
    }

    public static int findDifferenceBetweenIndexesOfMaxAndMinNumbersMethod(int[] array, boolean printResult) {
        int maximumNumber = 1;
        int maximumNumberIndex = 0;
        int minimumNumber = 99;
        int minimumNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximumNumber) {
                maximumNumber = array[i];
                maximumNumberIndex = i;
            }
            if (array[i] < minimumNumber) {
                minimumNumber = array[i];
                minimumNumberIndex = i;
            }
        }
        if(printResult) {
            System.out.println("The number of elements between maximum and minimum members in your array is: " + Math.abs(maximumNumberIndex - minimumNumberIndex));
        }
        return Math.abs(maximumNumberIndex - minimumNumberIndex);
    }

    public static int findFirstPrimeNumbersMethod(int[] array, boolean printResult) {
        int firstPrimeNumber = 1;
        for (int i = 0; i < array.length; i++) {
            if (NumberUtils.isNumberPrime(array[i])) {
                firstPrimeNumber = array[i];
                break;
            }
        }
        if(printResult) {
            if (firstPrimeNumber == 1) {
                System.out.println("No prime numbers are given in this array.");
            } else {
                System.out.println("The first prime number in this array is : " + firstPrimeNumber);
            }
        }
        return firstPrimeNumber;
    }

    public static int findLastPrimeNumbersMethod(int[] array, boolean printResult) {
        int lastPrimeNumber = 1;
        for (int i = 0; i < array.length; i++) {

            if (NumberUtils.isNumberPrime(array[i])) {
                lastPrimeNumber = array[i];
            }
        }
        if(printResult) {
            if (lastPrimeNumber == 1) {
                System.out.println("No prime numbers are given in this array.");
            } else {
                System.out.println("The last prime number in this array is : " + lastPrimeNumber);
            }
        }
        return lastPrimeNumber;
    }

    public static int primeNumbersCountMethod(int[] array, boolean printResult) {
        int primeNumbersCounter = 0;
        for (int i = 0; i < array.length; i++) {

            if (NumberUtils.isNumberPrime(array[i])) {
                primeNumbersCounter++;
            }
        }
        if(printResult) {
            if (primeNumbersCounter == 0) {
                System.out.println("No prime numbers are given in this array.");
            } else {
                System.out.println("The number of prime numbers in this array is : " + primeNumbersCounter);
            }
        }
        return primeNumbersCounter;
    }





}

