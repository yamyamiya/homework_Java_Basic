package org.example.Task7;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int userNumber;
        System.out.println("Please enter a three-digit number:");
        Scanner scanner = new Scanner(System.in);
        userNumber = scanner.nextInt();
        DigitsCalculation digitsCalculation = new DigitsCalculation();
        System.out.println("You number has the following digits:");
        System.out.println(digitsCalculation.hundreds(userNumber));
        System.out.println(digitsCalculation.tens(userNumber));
        System.out.println(digitsCalculation.ones(userNumber));







    }
}
