package org.example.Task2;

import org.example.Task1.Print;

public class Task2WithCreationOfArray {
    public static void main(String[] args) {
        CreationOfArrayUtil util = new CreationOfArrayUtil();
        int k = util.randomNumber(10,2);
        int[] array = util.creationOfArray();
        Print.printArray("Your array is ", array);
        System.out.println("Number of pairs of elements which sum is equal to " + k + " is " + CounterOfPairs.counterOfPairs(array, k));
    }
}
