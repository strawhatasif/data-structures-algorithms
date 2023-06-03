package com.fun.algorithms.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(findFactorialIterative(5));
        System.out.println(findFactorialRecursive(5));
    }

    //Factorial = number * number - 1 until 1. (ex: 5! is 5*4*3*2*1)
    protected static int findFactorialRecursive(int number) {
        //base case - return if we already have 2
        if (number == 2) {
            return 2;
        }
        return number * findFactorialRecursive(number-1);
    }

    protected static int findFactorialIterative(int number) {
        int answer = 1;

        //sanity check - if number already equals 2, assign it to the answer
        if (number == 2) {
            answer = 2;
        }
        for (int i=2; i<=number; i++) {
            answer = answer * i;
        }

        return answer;
    }
}
