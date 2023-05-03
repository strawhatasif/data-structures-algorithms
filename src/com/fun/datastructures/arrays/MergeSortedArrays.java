package com.fun.datastructures.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        var array1 = new int[]{0,3,4,31};
        var array2 = new int[]{4,6,30};

        int[] sortedArray = mergeSortedArrays(array1, array2);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] mergeSortedArrays(int[] array1, int[] array2) {
        var mergedArray = new int[array1.length + array2.length];

        var i = 0;
        var j = 0;
        var k = 0;

        //First, check input
        if (array1.length == 0)  {
            return array2;
        }

        if (array2.length == 0) {
            return array1;
        }

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
                k++;
            }
            else {
                mergedArray[k] = array2[j];
                j++;
                k++;
            }
        }

        while (i < array1.length) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
