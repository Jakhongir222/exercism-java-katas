package com.example.exercismjavakatas.AccumString;

import java.util.Arrays;

public class Accum {
    public static String accum(String s) {
        StringBuilder formatted = new StringBuilder();
        String upperCaseString = s.toUpperCase();
        char[] chars = upperCaseString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            formatted.append(c);  // har bitta char arrayni String builderni ichiga qo'shayapmiz, hammasi Uppercase hozir
            for (int j = 0; j < i; j++) { // bu yerda j < i, shu sababli 4 bsa stand kami, va uni 4marta aylantirib lowercase qilib iterate qilamiz
                formatted.append(Character.toLowerCase(c));
            }
            if (i != chars.length - 1) {  // bu yerdan agar oxirgiosi kelgan bsa tuxtaydi kemagan bsa -nu qiyib yana iterate qilaveradi
                formatted.append("-");
            }
        }
        return formatted.toString();
    }

    public static String high(String s) {
        String[] words = s.split(" ");

        int maxSum = 0;
        String wordWithMaxSum = "";

        for (String word : words) {
            int wordSum = 0;
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    int charValue = Character.toLowerCase(c) - 'a' + 1; // This is because the ASCII value of 'a' is 97,
                    // and subtracting 'a' from 'a' will yield 0, 'b' from 'a' will yield 1, 'c' from 'a' will yield 2,
                    // and so forth.
                    wordSum += charValue;
                }
            }
            if (wordSum > maxSum) {
                maxSum = wordSum;
                wordWithMaxSum = word;
            }
        }
        return wordWithMaxSum;
    }

    public static String mouthSize(String animal){
        if(animal.equalsIgnoreCase("alligator")){  //we can shorten the str.toLowerCase() and str.equals() with str.equalsIgnoreCase()
            return "small";
        }
        return "wide";
    }
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");  // don't forget the bracets
    }

    public static int arithmetic(int a, int b, String operator) {
        switch (operator.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int maxSumSoFar = arr[0];  // first element of the array
        int endingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            endingHere = Math.max(arr[i], endingHere + arr[i]);  //Math.max(8,5) javobi 8 buladi eng kattasi oladi taqqoslab
            maxSumSoFar = Math.max(maxSumSoFar, endingHere);  // bu yerda birinchi da turgaidan kattami deb boshlanadi va taqqoslaydi
        }
        if(maxSumSoFar<0) return 0;
        return maxSumSoFar;
    }


}
