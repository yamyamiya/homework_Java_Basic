package org.example.Task4;

public class MathOperations {
    public int addition(int a, int b){
        int resultOfAddition = a+b;
        return resultOfAddition;
    }
    public int substraction(int a, int b) {
        int resultOfSubstraction = a - b;
        return resultOfSubstraction;
    }
    public int multiplication(int a, int b) {
        int resultOfMultiplication = a * b;
        return resultOfMultiplication;
    }
    public double division(int a, int b) {
        double resultOfDivision = Math.round((double) a / b*100.0)/100.0;
        return resultOfDivision;
    }
}
