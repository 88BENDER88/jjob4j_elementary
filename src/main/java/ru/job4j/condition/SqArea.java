package ru.job4j.condition;

public class SqArea {
    public static double sqArea(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = sqArea(6, 2);
        System.out.println("result p=6, k=2, s=2, real = " + result1);
    }
}

