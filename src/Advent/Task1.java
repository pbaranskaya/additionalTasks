package Advent;

// Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
// Организовать ввод числа с консоли.

import java.util.Scanner;

public class Task1 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
        int temp;
        int sq_temp;
        int result;

        System.out.print("Введите число ");
        a = sc.nextInt();

        temp = a % 10;
        sq_temp = temp * temp;
        result = sq_temp % 10;
        System.out.println("Последняя цифра квадрата " + a + " = " + result);

    }
}
