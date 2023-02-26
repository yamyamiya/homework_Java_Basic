package org.example.Task2;

import java.util.Scanner;

public class UserInput {
    public static int userInput(String message){
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }
}
