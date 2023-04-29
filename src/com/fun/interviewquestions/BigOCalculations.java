package com.fun.interviewquestions;

/**
 * See https://www.bigocheatsheet.com/ for more information and helpful tidbits about "Big O"
 */
public class BigOCalculations {

    public static void main(String[] args) {
        funChallenge(new int[]{2,3,4});
        anotherFunChallenge(new int[]{1,200,50,340,22,99,9999});
    }

    private static int funChallenge(int[] input) {
        var a = 10; //O(1)
        a = 50 + 3; //O(1)

        for (var i=0; i<input.length; i++) { //O(n) - because this is variable depending on length of input argument.
            a++;
        }
        return a;
    }

    private static void anotherFunChallenge(int[] input) {
        var a = 5; //O(1) - because only done once and is constant regardless of length of input
        var b = 10; //O(1) - because only done once and is constant regardless of length of input
        var c = 50; //O(1) - because only done once and is constant regardless of length of input

        for (var i=0; i<input.length; i++) {
            var x = i + 1; //O(n) - dependent on length of input argument and is variable
            var y = i + 2; //O(n) - dependent on length of input argument and is variable
            var z = i + 3; //O(n) - dependent on length of input argument and is variable
        }

        for (var j=0; j<input.length; j++) {
            var p = j * 2; //O(n) - dependent on length of input argument and is variable
            var q = j * 2; //O(n) - dependent on length of input argument and is variable
        }
    }
}
