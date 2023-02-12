package org.example.Task7;

import java.util.Scanner;

public class NumberDemo {
    public static void main(String[] args) {
        int userNumber;
        System.out.println("Please enter a three-digit number:");
        Scanner scanner = new Scanner(System.in);
        userNumber = scanner.nextInt();
        DigitsCalculation digitsCalculation = new DigitsCalculation();
        System.out.println("You number has the following digits:");
        digitsCalculation.hundreds(userNumber);
        digitsCalculation.tens(userNumber);
        digitsCalculation.ones(userNumber);
        System.out.println("-----------------------------");
        int num1 = userNumber/100;
        int num2 = (userNumber/10)%10;
        int num3 = userNumber%10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);




    }
}
