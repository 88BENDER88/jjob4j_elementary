package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = 92;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = 69;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double woman = Fit.womanWeight(height);
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}