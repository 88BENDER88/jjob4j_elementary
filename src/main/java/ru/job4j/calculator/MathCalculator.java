package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double SumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double SumMinus(double first, double second) {
        return ru.job4j.math.MathFunction.minus(first, second)
                + ru.job4j.math.MathFunction.division(first, second);
    }

    public static double SuperSum(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.minus(first, second)
                + ru.job4j.math.MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + SumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + SumMinus(10, 20));
        System.out.println("Результат расчёта равен: " + SuperSum(10, 20));
    }

}
