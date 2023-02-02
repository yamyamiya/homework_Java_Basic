package org.example.Task4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first positive integer number:");
        int a = userInput.firstNumber = scanner.nextInt();
        System.out.println("Please enter your second positive integer number:");
        int b = userInput.secondNumber = scanner.nextInt();
        MathOperations mathOperations = new MathOperations();

        System.out.println("Here is the result of mathematical operations with the provided numbers, ");
        System.out.println("where " +a+" is the first argument and " +b+" is the second argument:");
        System.out.println("addition: " + mathOperations.addition(a,b));
        System.out.println("substraction: " + mathOperations.substraction(a,b));
        System.out.println("multiplication: "+ mathOperations.multiplication(a,b));
        System.out.println("division: "+ mathOperations.division(a,b));






    }
}
