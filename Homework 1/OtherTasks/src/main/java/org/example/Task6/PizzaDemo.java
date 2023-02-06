package org.example.Task6;

import java.util.Scanner;

public class PizzaDemo {
    public static void main(String[] args) {
        System.out.println("Which diameter of pizza do you prefer: 24 or 28 cm? Please enter your number:");
        Scanner scanner = new Scanner(System.in);
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator((scanner.nextInt()));
        caloriesCalculator.calories();
        }

}
