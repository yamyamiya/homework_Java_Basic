package Task3;

import java.util.Scanner;

//Представим, что у нас есть устройство, в котором две колбы.
// Прибор работает корректно, если температура первой колбы выше 100 градусов,
// а температура второй колбы меньше 100 градусов.
// Вы должны написать метод, который проверяет это устройство.
// Ваша программа должна иметь переменные Temperature1 и Temperature2.
// В результате он выводит сообщение true или false.
public class DeviceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature of the first flask:");
        int temperature1 = scanner.nextInt();
        System.out.println("Please enter the temperature of the second flask:");
        int temperature2 = scanner.nextInt();
        System.out.println(checkValues(temperature1, temperature2));

    }

    public static boolean checkValues(int t1, int t2) {
        return t1 > 100 && t2 < 100;
    }
}
