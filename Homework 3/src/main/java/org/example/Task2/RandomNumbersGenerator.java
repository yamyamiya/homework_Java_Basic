package org.example.Task2;

public class RandomNumbersGenerator {
    public static int generateRandomNumber(){
         int max = 99;
         int min = 10;
        return (int)(Math.random()*(max-min+1)+min);
    }
}
