package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.withPrecision;

class ConverterTest {

    @Test
    void whenConvert140RublThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubletoEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float input = 180;
        float expected = 3.0f;
        float output = Converter.rubletoDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));

    }
}