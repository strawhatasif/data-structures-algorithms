package com.fun.datastructures.hashtables;

import java.util.HashSet;

public class FirstRecurringCharacter {

    public static void main(String[] args) {
        System.out.println(firstRecurringCharacter(new int[]{2,5,1,2,3,5,2,2,4}));
        System.out.println(firstRecurringCharacterOptimized(new int[]{2,5,1,2,3,5,2,2,4}));
    }

    // O(n^2) cost - brute force approach where we are looping twice to compare input, one integer at a time.
    protected static int firstRecurringCharacter(int[] input) {
        for (int i=0; i<input.length; i++) {
            for (int j=i+1; j<input.length; j++) {
                if(input[i] == input[j]) {
                    return input[i];
                }
            }
        }
        return 0;
    }

    //O(n) cost - one loop - variable input.
    protected static int firstRecurringCharacterOptimized(int[] input) {
        var hashSet = new HashSet<Integer>();

        for (int i=0; i<input.length; i++) {
            if (hashSet.contains(input[i])) {
                return input[i];
            }
            else {
                hashSet.add(Integer.valueOf(input[i]));
            }
        }
        return 0;
    }
}
