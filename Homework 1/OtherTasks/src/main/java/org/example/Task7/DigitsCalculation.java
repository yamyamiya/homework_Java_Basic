package org.example.Task7;

public class DigitsCalculation {

    public void hundreds(int number){
        System.out.println(number/100);
    }

    public void tens(int number){
        int hund = number/100;
        System.out.println((number - hund*100)/10);
    }
    public void ones (int number){
        int tens = number/10;
        System.out.println(number -tens*10);
    }
}
