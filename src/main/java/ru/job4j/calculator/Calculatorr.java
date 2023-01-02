package ru.job4j.calculator;

public class Calculatorr {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);

    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);

    }

    public static void main(String[] args) {
        plus(5, 5);
        plus(10, 20);
        minus(100, 1);
        minus(50, 1);
    }
}