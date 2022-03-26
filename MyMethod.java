package ru.gb.lesson_2;

public class MyMethod {

    public static void main(String[] args) {

        //  Задание № 1
        printSumBool(7, 3);

        // Задание № 2
        printSign(7);

        // Задание № 3
        System.out.println(signReturn(5));

        // Задние № 4
        printFewString("Привет мир!", 4);

        // Задание №5
        System.out.println("\n" + leapYear(2024));
    }

    // Метод к заданию № 1
    public static boolean printSumBool(int a, int b) {

        boolean c;
        if (a + b >= 10 && a + b <= 20) {
            c = true;
        } else {
            c = false;
        }
        System.out.println(c);
        return c;
    }

    // Метод к заданию № 2
    public static void printSign(int sign) {

        if (sign >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    // Метод к заданию № 3
    public static boolean signReturn(int reverse) {

        if (reverse >= 0) {
            return false;
        } else {
            return true;
        }
    }

    // Метод к заданию № 4
    public static void printFewString(String str, int few) {

        while (few > 0) {
            System.out.print(str + " ");
            few--;
        }
    }

    // Метод к заданию № 5
    public static boolean leapYear(int year) {

        if (((year % 4 == 0) && year != 100) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}