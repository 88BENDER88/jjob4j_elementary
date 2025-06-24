package ru.job4j.calculator;

public class Converter {

    public static float rubletoEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubletoDollar(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubletoEuro(140);
        float dollar = Converter.rubletoDollar(175);
        System.out.println("140 rubles is " + euro + " euro.");
        System.out.println("175 rubles is " + dollar + " dollar. ");
        float input = 140;
        float expected =2;
        float output = Converter.rubletoEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }

}
