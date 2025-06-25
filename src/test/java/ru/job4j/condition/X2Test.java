package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        assertThat(X2.calc(10, 0, 0, 2))
                .isEqualTo(40);
    }

    @Test
    void whenA0B1C1X1() {
        assertThat(X2.calc(0, 1, 1, 1))
                .isEqualTo(2);
    }

    @Test
    void whenA1B1C1X1() {
        assertThat(X2.calc(1, 1, 1, 1))
                .isEqualTo(3);
    }

    @Test
    void whenA1B1C0X1() {
        assertThat(X2.calc(1, 1, 0, 1))
                .isEqualTo(2);
    }

    @Test
    void whenA1B1C1X0() {
        assertThat(X2.calc(1, 1, 1, 0))
                .isEqualTo(1);
    }
}