package com.medisean.demo.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    void shouldReturnCorrectIndexWhenTargetExists() {
        int[] nums = {1, 3, 5, 7, 9, 11};
        assertEquals(3, BinarySearch.search(nums, 7));
    }

    @Test
    void shouldReturnMinusOneWhenTargetDoesNotExist() {
        int[] nums = {1, 3, 5, 7, 9, 11};
        assertEquals(-1, BinarySearch.search(nums, 6));
    }
}
