package Task6;

import java.util.Scanner;

public class BankTerminalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysCounter = 0;
        System.out.println("What is your balance? Please enter an integer number:");
        int moneyOnAccount = scanner.nextInt();
        int divider = moneyOnAccount / 2;
        while (divider >= 1) {
            if (moneyOnAccount % divider != 0) {
                divider--;
            } else {
                System.out.println(moneyOnAccount + " " + divider+ " " + daysCounter);
                moneyOnAccount = moneyOnAccount - divider;
                daysCounter++;
                divider = moneyOnAccount / 2;
            }
        }
        if (moneyOnAccount == 1) {
            daysCounter++;
        }
        System.out.println("Number of days you need to get your money from the account is: " + daysCounter);
    }
}
