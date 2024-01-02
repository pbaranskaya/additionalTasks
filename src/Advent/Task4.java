package Advent;
import java.util.Scanner;

// Составить программу, печатающую значение true, если указанное высказывание является истинным, и false —
// в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных. Организовать ввод чисел с консоли.

public class Task4 {
    private static final Scanner sc = new Scanner(System.in);
    private static int A;
    private static int B;
    private static int C;
    private static int D;

    public static void main(String[] args) {
        System.out.println("Введите числа");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        System.out.println("Четных чисел >= 2?");
        System.out.println(EvenNumbers(A, B, C, D) ? "true" : "false");
    }

    public static boolean EvenNumbers(int A, int B, int C, int D) {
        int amount = 0;
        if (A % 2 == 0) {
            amount++;
            if (B % 2 == 0) {
                amount++;
            }
            if (C % 2 == 0) {
                amount++;
            }
            if (D % 2 == 0) {
                amount++;
            }
        }
        if (amount >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
