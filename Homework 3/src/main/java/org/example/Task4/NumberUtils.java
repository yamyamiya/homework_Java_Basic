package org.example.Task4;

public class NumberUtils {
    public static boolean isNumberPrime(int number){
        boolean isPrime = true;
        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
