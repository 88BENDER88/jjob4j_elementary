package ru.job4j.calculator;

public class Converterr {

    public static float rubletoEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        return -1;
    }

    public static void main(String[] args) {
        float euro = Converter.rubletoEuro(140);
        System.out.println("140 rubles is " + euro + " euro.");
        float input = 140;
        float expected =2;
        float output = Converter.rubletoEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }

}