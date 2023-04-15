package com.example.exercismjavakatas.CountDuplicates;

import java.util.Arrays;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int count=0;

        String textCase = text.toLowerCase();
        char [] chars = textCase.toCharArray();
        Arrays.sort(chars);  //Sort qilishimiz kerak chunki oldingi va kayingi characterni taqqoslayapmiz
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
                while (i < chars.length - 1 && chars[i] == chars[i + 1]) { //2 marta tekirmasligimiz uchun i++ bor bu yerda
                    i++;
                }
            }
        }
        return count;
    }
}
