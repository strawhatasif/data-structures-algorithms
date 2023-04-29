package com.fun.datastructures.arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        var array1 = new int[]{0,3,4,31};
        var array2 = new int[]{4,6,30};

        int[] sortedArray = mergeSortedArrays(array1, array2);
        System.out.println(sortedArray);
    }

    private static int[] mergeSortedArrays(int[] array1, int[] array2) {
        var mergedArray = new int[array1.length];

        int array1Item = array1[0];
        int array2Item = array2[0];
        var i = 0;
        var j = 0;

        //First, check input
        if (array1.length == 0)  {
            return array2;
        }

        if (array2.length == 0) {
            return array1;
        }

        while (array1Item >= 0  || array2Item >= 0) {
            System.out.println(array1Item);
            System.out.println(array2Item);
            if ((array2.length > array1.length) || array1Item < array2Item) {
                mergedArray[i] = array1Item;
                array1Item = array1[i];
                i++;
            }
            else {
                mergedArray[j] = array2Item;
                array2Item = array2[j];
                j++;
            }
        }

        return mergedArray;
    }
}
