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
    void shouldHandleBaseCases() {
        assertEquals(0, Fibonacci.dynamicProgramming(0));
        assertEquals(1, Fibonacci.dynamicProgramming(1));
        assertEquals(0, Fibonacci.recursive(0));
        assertEquals(1, Fibonacci.recursive(1));
    }

    @Test
    void shouldMatchKnownSequenceValues() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], Fibonacci.dynamicProgramming(i));
        }
    }

    @Test
    void shouldRejectNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.dynamicProgramming(-1));
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.recursive(-1));
    }
}
