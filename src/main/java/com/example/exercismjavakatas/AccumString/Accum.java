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
                    int charValue = Character.toLowerCase(c) - 'a' + 1;
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
}
