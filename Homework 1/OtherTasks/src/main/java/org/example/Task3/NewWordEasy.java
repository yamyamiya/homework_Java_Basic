package org.example.Task3;

import java.util.Scanner;

public class NewWordEasy {
    public static void main(String[] args) {
        System.out.println("Please enter your first word with even number of letters:");
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String part1 = firstWord.substring(0, firstWord.length() / 2);
        System.out.println("Please enter your second word with even number of letters:");
        String secondWord = scanner.nextLine();
        String part2 = secondWord.substring(secondWord.length() / 2);
        System.out.println("Your new word is: " + part1+part2);
    }



}
