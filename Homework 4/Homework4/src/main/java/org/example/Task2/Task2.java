package org.example.Task2;

import org.example.Task1.Print;

public class Task2 {
    static int k1 = 6;
    static int k2 = 2;

    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 1};
        int[] array2 = {1, 1, 1, 1};
        Print.printArray("Your first array is ", array1);
        System.out.println("Number of pairs of elements which sum is equal to " + k1 + " is " + CounterOfPairs.counterOfPairs(array1, k1));
        System.out.println();
        Print.printArray("Your second array is ", array2);
        System.out.println("Number of pairs of elements which sum is equal to " + k2 + " is " + CounterOfPairs.counterOfPairs(array2, k2));
    }

}
