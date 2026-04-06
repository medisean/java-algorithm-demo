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
    void shouldReturnBoundaryIndexes() {
        int[] nums = {1, 3, 5, 7, 9, 11};

        assertEquals(0, BinarySearch.search(nums, 1));
        assertEquals(5, BinarySearch.search(nums, 11));
    }

    @Test
    void shouldReturnMinusOneWhenTargetDoesNotExist() {
        int[] nums = {1, 3, 5, 7, 9, 11};
        assertEquals(-1, BinarySearch.search(nums, 6));
    }

    @Test
    void shouldReturnMinusOneForEmptyArray() {
        int[] nums = {};
        assertEquals(-1, BinarySearch.search(nums, 1));
    }

    @Test
    void shouldWorkForSingleElementArray() {
        int[] nums = {42};

        assertEquals(0, BinarySearch.search(nums, 42));
        assertEquals(-1, BinarySearch.search(nums, 7));
    }
}
