package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.minus(first, second)
                - minus(first, second);
    }

    public static double dubleAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.drobe(first, second)
                / drobe(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minus(10, 20));
        System.out.println("Результат расчета равен: " + drobe(10, 20));
    }
}

