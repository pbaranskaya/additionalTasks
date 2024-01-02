package Advent;

// Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце и
// вывести «високосный год» если год является високосным. Организовать ввод числа с консоли.

import java.util.Scanner;

public class Task2 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Месяц: ");
        int month = sc.nextInt();
        System.out.println("Год: ");
        int year = sc.nextInt();

        String DaysInMonth = DaysInMonth(month,year);
        System.out.println("В месяце " + DaysInMonth);

        String IsLeapYear = IsLeapYear(year);
        System.out.println(year + " " + IsLeapYear);

    }

    static String DaysInMonth(int month, int year) {
        switch (month) {
            case 1 : {
                return  ("Январь : 31 день");
            }
            case 2 : {
                if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    return("Февраль : 29 день");
                } else {
                    return("Февраль : 28 день");
                }
            }
            case 3 : {
                return("Март : 31 день");
            }
            case 4 : {
                return("Апрель : 30 день");
            }
            case 5 : {
                return("Май : 31 день");
            }
            case 6 : {
                return("Июнь : 30 день");
            }
            case 7 : {
                return("Июль : 31 день");
            }
            case 8 : {
                return("Август : 31 день");
            }
            case 9 : {
                return("Сентябрь : 30 день");
            }
            case 10 : {
                return("Октябрь : 31 день");
            }
            case 11 : {
                return("Ноябрь : 30 день");
            }
            case 12 : {
                return("Декабрь : 31 день");
            }
            default:
                return("Введите номер месяца от 1 до 12");
        }
    }

    static String IsLeapYear(int year) {
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return("високосный год");
        } else {
            return("невисокосный год");
        }
    }
}
