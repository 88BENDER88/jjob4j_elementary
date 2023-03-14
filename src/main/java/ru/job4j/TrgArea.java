package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double period = (a + b + c) / 2;
        double rsl = Math.sqrt(period * (period - a) * (period - b) * (period - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 3, 4);
        System.out.println("area (2, 3, 4) = " + rsl);
    }
}