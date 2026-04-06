package com.medisean.demo.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {
    @Test
    void shouldCalculateFibonacciWithDynamicProgramming() {
        assertEquals(55, Fibonacci.dynamicProgramming(10));
    }

    @Test
    void shouldCalculateFibonacciRecursively() {
        assertEquals(8, Fibonacci.recursive(6));
    }

    @Test
    void shouldRejectNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.dynamicProgramming(-1));
    }
}
