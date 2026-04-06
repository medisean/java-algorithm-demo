package com.medisean.demo;

import com.medisean.demo.algorithms.BinarySearch;
import com.medisean.demo.algorithms.Fibonacci;

public class App {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        int index = BinarySearch.search(nums, target);
        int fib = Fibonacci.dynamicProgramming(10);

        System.out.println("Binary search target " + target + " index: " + index);
        System.out.println("Fibonacci(10) = " + fib);
    }
}
