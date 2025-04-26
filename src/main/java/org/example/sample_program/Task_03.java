package org.example.sample_program;

import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {

        //program01();
        //program02();
        program03();

    }


    //you are given a string s. The score of a string is defined as the
    //sum og the absolute difference between the ASCII values of adjacent characters (смежные символы)
    //Example 1
    //Inputs: s = "hello"
    //Output: 13
    //Explanation h=104, e=101, l=108,o=111
    //So, the score of s would be |104-101|+|101-108|+|108-108|+|108-111| = 3+7+0+3=13
    //
    //
    public static void program01() {
        var testStr01 = scoreOfString("Hello");
        System.out.println(testStr01);
        System.out.println();
        var testStr02 = scoreOfString("Dragon");
        System.out.println(testStr02);
        System.out.println();
    }
    public static int scoreOfString(String message) {
        var s = message.toLowerCase();
        int sum = 0;
        for(int i = 1; i < s.length(); i++) {
            sum += abs(s.charAt(i-1) - s.charAt(i));
        }
        return sum;
    }
    private static final int abs(int num) {
        return num < 0 ? -num : num;
    }

    //Given two integers, num and t. A number is achievable if it can become equal ti num after applying the following operator:
    //Increase or decrease the number by 1, and simultaneously increase or decrease num by 1.
    //Return the maximum achievable number after applying the operation at most t times
    //Example 1
    //Input: num = 4, t = 1
    //Output: 6
    //
    public static void program02() {
        var ansTest01 = theMaximumAchievable(4, 1);
        System.out.println(ansTest01);
        System.out.println();

        var intArray02 = new int[] {1, 5, 1};
        var ansTest02 = getConcatenation(intArray02);
        System.out.println(ansTest02);
        Arrays.stream(ansTest02).forEach(item -> System.out.print(item + " "));

        var intArray03 = new int[] {1, 5, 1};
        var ansTest03 = getConcatenationV2(intArray02);
        System.out.println(ansTest02);
        Arrays.stream(ansTest03).forEach(item -> System.out.print(item + " "));
    }

    public static int theMaximumAchievable(int num, int t) {
        return num + 2 * t;
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for(int i = nums.length; i < nums.length * 2; i++) {
            ans[i] = nums[i-nums.length];
        }
        return ans;
    }

    public static int[] getConcatenationV2(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for(int i = 0; i < nums.length * 2; i++) {
            ans[i] = nums[i < nums.length ? i: i - nums.length];
        }
        return ans;
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }


    public static void program03() {
        var sumIndex = findPermutationDifference("abc", "bac");
        System.out.println(sumIndex);

        System.out.println();
        var doubleArray01 = convertTemperature(36.50);
        System.out.println(doubleArray01);
        Arrays.stream(doubleArray01).forEach(item -> System.out.print(item + ", "));
    }

    //You are given two strings s and t such that every
    // character occurs at most once in s and t is a permutation of s.
    //The permutation difference between a and t is defined as the sum of the absolute
    // difference between the index of the occurrence of each character in s and the
    // index of the occurence of the same character in t.
    //Return the permutation difference between s and t
    //Example 1
    //Input s = "abc, t = "bac"
    //Output: 2
    public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            sum += abs(i - t.indexOf(s.charAt(i)));
        }
        return sum;
    }

    //You are given a non-negative floating point number
    //rounded to two decimal places celsius, that denotes the temperature in Celsius
    //You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans =[Kelvin, Fahrenheit]
    //return the array ans/ Answer within 10-5 of the actual answer will be accepted

    //Note that:
    //Kelvin = Celsius + 273.15
    //Fahrenheit = Celsius * 1.80 +32.00

    //Example 1
    //Input celsius = 36.50
    //Output [309.65000? 97.70000]
    //
    public static double[] convertTemperature(double celsius) {

        double[] ans = {celsius + 273.15, celsius*1.8+32};
        return ans;
    }


}
