package org.example.Task7;

public class DigitsCalculation {

    public int hundreds( int number){
        return number/100;
    }

    public int tens( int number){
        int hund = number/100;
        return (number - hund*100)/10;
    }
    public int ones ( int number){
        int hund = number/100;
        int tens = (number - hund*100)/10;
        return number -hund*100 - tens*10;
    }
}
