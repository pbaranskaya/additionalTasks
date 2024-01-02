package Advent;

import java.util.Scanner;

// Составить программу, печатающую значение true, если указанное высказывание является истинным, и false —
// в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
// Организовать ввод чисел с консоли.

public class Task3 {

    private static final Scanner sc = new Scanner(System.in);
    private static int a;

    public static void main(String[] args) {

        System.out.println("Введите число ");
        a = sc.nextInt();
        System.out.println(isPerfectNumber(a) ? "true" : "false");
    }

    public static boolean isPerfectNumber(int a) {
        int divider = 1;
        int sum = 0;
        while (divider < a) {
            if (a % divider == 0) {
                sum += divider;
            }
            divider++;
        }
        if (a == sum) {
            return true;
        } else {
            return false;
        }
    }
}