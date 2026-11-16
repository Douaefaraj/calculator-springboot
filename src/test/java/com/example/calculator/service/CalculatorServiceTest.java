
package com.example.calculator.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculator = new CalculatorService();

    @Test
    void testAddition() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    void testSoustraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testDivisionParZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
