package com.fun.algorithms.recursion;

import java.util.ArrayList;

public class Fibonacci {

    public static void main (String[] args) {
        System.out.println(fibonacciIterative(2));
        System.out.println(fibonacciRecursive(43));
    }

    protected static int fibonacciRecursive(int n) {
        //base case
        if (n < 2) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    protected static int fibonacciIterative(int n) {
        //create an int array and set the first number to 0 and second number to 1
        int intArray[] = new int[n+2];
        intArray[0] = 0;
        intArray[1] = 1;

        for (int i=2; i<n+1;i++) {
            intArray[i] = intArray[i-1] + intArray[i-2];
        }
        return intArray[n];
    }
}
