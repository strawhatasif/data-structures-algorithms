package com.fun.interviewquestions;

import java.util.HashMap;

public class CommonItem {
    public static void main(String[] args) {
        var array1 = new char[]{'a', 'd', 'r'};
        var array2 = new char[]{'s', 'r', 'e'};
        boolean containsItem = containsCommonItem(array1, array2);
        System.out.println(containsItem);

        boolean doesItContainTheItem = containsCommonItemSimplified(array1, array2);
        System.out.println(doesItContainTheItem);
    }

    //This is the "brute force" approach where we are looping through 2 input arrays.
    //Cost: O(n^2)
    private static boolean containsCommonItem(char[] array1, char[] array2) {
        for (var i=0; i<array1.length; i++) {
            for (var j=0; j<array2.length; j++) {
                if (array1[i] == array2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //Cost - O(n)
    private static boolean containsCommonItemSimplified(char[] array1, char[] array2) {
        var map = new HashMap<>();
        for (var i=0; i<array1.length; i++) {
            if (!map.containsValue(array1[i])) {
                var item = array1[i];
                map.put(i, array1[i]);
            }
        }

        //loop through second array and check if item in second array exists in the HashMap
        for (var j=0; j < array2.length; j++) {
            if (map.containsValue(array2[j])) {
                return true;
            }
        }
        return false;
    }
}
