package ru.job4j.calculator;

public class Converter {

    public static float rubletoEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubletoDollar(float value) {
        float rsl = value / 85;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubletoEuro(150);
        float dollar = Converter.rubletoDollar(175);
        System.out.println("150 rubles is + " + euro + " euro.");
        System.out.println("175 rubles is + " + dollar + " dollar. ");
    }

}
