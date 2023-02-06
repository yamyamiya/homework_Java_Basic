package org.example.Task6;

public class CaloriesCalculator {
    int usersDiameter;

    public CaloriesCalculator(int usersDiameter) {
        this.usersDiameter = usersDiameter;
    }
    double caloriesDifference = Math.round(Math.PI * (14 * 14 - 12 * 12) * 40*100.0)/100.0;
    public void calories() {
        if (usersDiameter == 28) {
            System.out.println("Remember! Bigger pizza - more gym expenses! You will get " + caloriesDifference + " more calories than those who made another choice ;)");
        } else if(usersDiameter == 24){
            System.out.println("Good choice! Enjoy your smaller pizza and get " + caloriesDifference + " fewer calories than those who made another decision ;)");
        } else{
            System.out.println("Did you enter one of the above numbers?");
        }
    }
}
