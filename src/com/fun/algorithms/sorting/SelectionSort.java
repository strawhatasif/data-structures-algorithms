package com.fun.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(Arrays.toString(sortSelection(numbers)));
    }

    protected static int[] sortSelection(int[] array) {
        int length = array.length;
        for (int i=0; i<length; i++) {
            //The minimum is the current index
            int min = i;
            int temp = array[i];
            for (int j=i+1; j<length; j++) {
                if (array[j] < array[min]) {
                    //Update the minimum IF the current value is lower than what was set previously
                    min = j;
                }
            }
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
