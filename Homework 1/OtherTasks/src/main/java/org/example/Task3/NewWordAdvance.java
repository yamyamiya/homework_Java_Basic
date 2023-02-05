package org.example.Task3;

import java.util.Scanner;

public class NewWordAdvance {
    public static void main(String[] args) {
        System.out.println("Please enter your first word with even number of letters:");
        Scanner scanner = new Scanner(System.in);
        String firstWord;
        firstWord = scanner.nextLine();
        while (firstWord.length() % 2 == 1 || firstWord.isBlank() || firstWord.isEmpty()) {
            System.out.println("Incorrect! Please enter your first word with EVEN number of letters:");
            scanner = new Scanner(System.in);
            firstWord = scanner.nextLine();
        }
        System.out.println("Please enter your second word with even number of letters:");
        String secondWord = scanner.nextLine();

        while (secondWord.length() % 2 == 1 || secondWord.isBlank() || secondWord.isEmpty() ) {
            System.out.println("Incorrect! Please enter your second word with EVEN number of letters:");
            secondWord = scanner.nextLine();
        }

        System.out.println("Your new word is: " + firstWord.substring(0, firstWord.length() / 2) + secondWord.substring(secondWord.length() / 2));
    }

}


