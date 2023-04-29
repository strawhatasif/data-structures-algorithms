package com.fun.datastructures.arrays;

public class StringReversal {
    public static void main(String[] args) {
        var input = "hi welcome";

        String reversedString = reverseString(input);
        System.out.println(reversedString);

        String stringReversed = reverseSimple(input);
        System.out.println(stringReversed);
    }

    private static String reverseString(String input) {
        //first, check input for sanity
        if (input.isEmpty() || input.isBlank()) {
            return "input not valid!";
        }

        var charArray = input.toCharArray();
        var result = new char[charArray.length];

        int totalItems = charArray.length - 1;

        for (var i = totalItems; i >= 0; i--) {
            //assign character to the new array by subtracting one from the length of the input character array
            //backwards, one character at a time.
            result[i] = charArray[totalItems-i];
        }

        return String.valueOf(result);
    }

    //Uses the built-in method from StringBuilder
    private static String reverseSimple(String input) {
        var output = new StringBuilder();
        output.append(input);

        return output.reverse().toString();
    }
}
