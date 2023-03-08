package Task5;

import java.util.Scanner;

public class LiftDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of floors in your building:");
        int totalNumberOfFloors = scanner.nextInt();
        System.out.println("Please enter the number of floors the broken lift goes up:");
        int floorsUp = scanner.nextInt();
        while (floorsUp > totalNumberOfFloors) {
            System.out.println("Please check your number. The number of floors the broken lift goes up cannot be more than the number of floors in the building.");
            System.out.println("Please enter the correct number of floors the broken lift goes up:");
            floorsUp = scanner.nextInt();
        }
        System.out.println("Please enter the number of floors the broken lift then goes down:");
        int floorsDown = scanner.nextInt();
        while (floorsDown > floorsUp) {
            System.out.println("Please check your number. The number of floors the broken lift goes down cannot be more than the number of floors it goes up.");
            System.out.println("Please enter the correct number of floors the broken lift then goes down:");
            floorsDown = scanner.nextInt();
        }
        numberOfLifts(totalNumberOfFloors, floorsUp, floorsDown);

    }

    public static void numberOfLifts(int floor, int stepUp, int stepDown) {
        int floorNumber = 0;
        int numberOfLifts = 0;
        while (floorNumber <= floor) {
            if(floorNumber+ stepUp<= floor) {
                floorNumber = floorNumber + (stepUp - stepDown);
                numberOfLifts++;
            }
            else{
                numberOfLifts++;
                floorNumber = floorNumber+stepUp;
            }
//            floorNumber = floorNumber + (stepUp - stepDown);
//            numberOfLifts++;
        }
        System.out.println("To get on the top of the building you will need " + numberOfLifts + " lifts.");

    }
}


