package Task2;

import java.util.Scanner;

//Создайте две переменные isEdekaOpen и isReweOpen,
// значения которых зависят от того, открыты магазины или нет.
// Реализует логический метод canBuy,, возвращающий true **
// Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
// Отобразите строку «Я могу купить еду, это ……» и значение.
public class ShopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is Edeka open?");
        boolean isEdekaOpen = scanner.nextBoolean();
        System.out.println("Is Rewe open?");
        boolean isReweOpen = scanner.nextBoolean();
        System.out.println("I can buy food - " + canBuy(isEdekaOpen, isReweOpen));
    }

    public static boolean canBuy(boolean edekaIsOpen, boolean reweIsOpen) {
        if (edekaIsOpen || reweIsOpen) {
            return true;
        } else {
            return false;
        }
    }
}
