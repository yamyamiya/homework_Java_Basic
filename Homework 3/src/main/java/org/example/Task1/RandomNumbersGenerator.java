package org.example.Task1;

public class RandomNumbersGenerator {
    public static int generateRandomNumber(){
        int max = 50;
        int min = 1;
        return (int)(Math.random()*(max-min+1)+min);
    }
}
