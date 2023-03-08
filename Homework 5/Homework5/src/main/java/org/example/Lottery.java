package org.example;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    Random random = new Random();

    int[] winningNumbers = new int[5];

    public static void main(String[] args) {
        Lottery lot = new Lottery();
        UserInput ui = new UserInput();
        lot.setRandomValue();
        System.out.println("Winning numbers: " + Arrays.toString(lot.winningNumbers));
        int[] userNumbers = ui.getUserNumbers("Please enter the numbers from your lottery ticket (from 1 to 50):");
        int[] matchNumbers = lot.checkWinningNumbers(userNumbers);
        lot.printMatchNumbers(matchNumbers);

    }

    public int getRandomValue() {
        int max = 50;
        int min = 1;
        return random.nextInt(max) + min;
    }

    public void setRandomValue() {
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = getRandomValue();
        }
        Arrays.sort(winningNumbers);
        for (int j = 1; j < winningNumbers.length; j++) {
            if (winningNumbers[j] == winningNumbers[j - 1]) {
                winningNumbers[j] = getRandomValue();
            }
        }
    }

    public int[] checkWinningNumbers(int[] userNumbers) {
        int counter = 0;
        int[] match = new int[userNumbers.length];
        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < winningNumbers.length; j++) {
                if (userNumbers[i] == winningNumbers[j]) {
                    match[counter] = userNumbers[i];
                    counter++;
                }
            }
        }
        return match;
    }

    public void printMatchNumbers(int[] matchNumbers) {
        int sum = 0;
        String message = "";
        String winningNumbersList = "";
        for (int i = 0; i < matchNumbers.length; i++) {
            sum = sum + matchNumbers[i];
            if (sum != 0) {
                message = "Here are the winning numbers from your ticket: ";
            }
            if (sum == 0) {
                message = "There are no winning numbers in your ticket.";
            }
            if (matchNumbers[i] != 0) {
                winningNumbersList = winningNumbersList + matchNumbers[i] + " ";
            }
        }
        System.out.println(message + winningNumbersList);

    }
}