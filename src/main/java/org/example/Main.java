package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColour();
        compareNumbers();
        checkSum();
        printNumberSign();
        checkNumber();
        printString("кайф",3);
        isLeapYear(2020);
        LeapYear();
        changeNum();
        empty();
        massiv12();
        massiv13();
        massiv14();
    }
// Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
// Задание 2
    public static void checkSumSign() {
        int a = 5;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }
// Задание 3
    public static void printColour() {
        int value = -10;
        if (value <= 0) {
            System.out.println("Красный");
        } if (value > 0 && value < 100) {
            System.out.println("жёлтый");
        } if (value > 100) {
            System.out.println("зелёный");
        }
    }
// задание  4
    public static void compareNumbers() {
        int a = 67;
        int b = 3;
        if (a > b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
// Задание 5
    public static void checkSum()  {
        int a = 10;
        int b = 10;
        int sum = a + b;
        boolean result = true;
        if (sum >= 10 && sum <= 20) {
            System.out.println(result);
            return;
        } else result = false; {
            System.out.println(result);
        }
    }
// Задание 6
    public static void printNumberSign() {
        int number = -50;
        if (number >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число"); }
    }
// Задание 7
    public static void checkNumber() {
        int a = -8;
        boolean result;
        if (a < 0) {
            result = true;
            System.out.println(result);
            return;
        } else {
            result = false;
            System.out.println(result);
            return;
        }
    }
// Задание 8
    public static void printString(String message, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(message);
        }
    }
// Задание 9
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void LeapYear() {
        int year = 2067;
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " високосный год: " + isLeap);
    }
// задание 10
    public static void changeNum(){
        int[] arr = new int[]{0, 1, 0, 1, 1, 0, 1, 0, 0, 1};
        System.out.println("Было: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        } System.out.println("Стало: " + Arrays.toString(arr));

    }
// Задание 11
    public static void empty() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        } System.out.println(Arrays.toString(arr));
    }
// задание 12
    public static void massiv12(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        } System.out.println(Arrays.toString(arr));
    }
// задание 13
    public static void massiv13 () {
        int n = 5;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            arr[i][n - i - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
// Заданик 14
    public static void massiv14() {
        int[] arr1 = createArray(5, 10);
        int[] arr2 = createArray(7, 20);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}
