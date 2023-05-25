package com.example.exercismjavakatas.AccumString;

public class Bio {

    public String dnaToRna(String dna){
        String result = dna.replaceAll("T", "U");
        return result;
    }



    public static String revRot(String str, int sz) {
        StringBuilder sb = new StringBuilder();
        if (sz <= 0 || str.isEmpty() || sz > str.length()) {
            return "";
        }
        int numSubStrings = str.length() / sz;

        for (int i = 0; i < numSubStrings; i++) {
            String sub = str.substring(i * sz, (i + 1) * sz);
            int sumOfCubes = calculateSumOfCubes(sub);
            if (sumOfCubes % 2 == 0) {
                sb.append(reverseString(sub));
            } else {
                sb.append(rotateString(sub));
            }
        }
        return sb.toString();
    }

    // Helper method to reverse a string
    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Helper method to rotate a string
    private static String rotateString(String str) {
        return str.substring(1) + str.charAt(0);
    }

    // Helper method to calculate the sum of cubes of digits in a string
    private static int calculateSumOfCubes(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            int digit = Character.getNumericValue(c);
            sum += digit * digit * digit;
        }
        return sum;
    }


    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }

    public static String repeatStr(final int repeat, final String string) {
        String newString ="";   // or I can just use return string.repeat(repeat);
        for(int i=0; i<repeat; i++){
            newString+=string;
        }
        return newString;
    }

}
