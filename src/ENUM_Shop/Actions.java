package ENUM_Shop;

import java.util.Scanner;

public enum Actions {
    AUTHENTICATION, CHOOSE_PRODUCT, BASKET, BUY;

    private static final Scanner sc = new Scanner(System.in);

    public static String getLogin (Scanner sc){
        System.out.print("Ввод логина: ");
        return sc.next();
    }

    public static int getPassword (Scanner sc){
        System.out.print("Ввод пароля: ");
        return sc.nextInt();
    }

    public static void printMainMenu(Scanner sc) {
        System.out.println("Выберите действие: ");
        System.out.println("AUTHENTICATION, CHOOSE_PRODUCT, BASKET, BUY");
    }
}
