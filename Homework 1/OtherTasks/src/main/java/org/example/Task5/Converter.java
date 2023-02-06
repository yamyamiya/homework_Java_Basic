package org.example.Task5;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of EUR: ");
        Scanner scanner = new Scanner(System.in);
        double amountOfEuro = scanner.nextDouble();
        double amountOfDol = Math.round(amountOfEuro* 1.07*100.0)/100.0;
        System.out.println("According to the current euro exchange rate 1 EUR = 1.09 USD.");
        System.out.println("Your amount is equal: " + amountOfDol+ " USD");



    }

}
