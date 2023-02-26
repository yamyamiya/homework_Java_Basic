package org.example.Task2;

public class CounterOfPairs {
    public static int counterOfPairs(int[] array, int k) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length && i + j < array.length; j++) {
                if (array[i] + array[i + j] == k) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
