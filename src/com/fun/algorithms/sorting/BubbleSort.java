package com.fun.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    protected static int[] bubbleSort(int[] array) {
        int length = array.length;

        //Two loops - each has to decrement the length by 1
        for (int i=0; i<length-1; i++) {
            for (int j=0; j<length-1; j++) {
                if (array[j] > array[j+1]) {
                    //Swap numbers
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
