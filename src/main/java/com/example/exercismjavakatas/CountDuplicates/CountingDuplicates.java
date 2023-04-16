package com.example.exercismjavakatas.CountDuplicates;

import java.util.Arrays;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int count = 0;

        String textCase = text.toLowerCase();
        char[] chars = textCase.toCharArray();
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


    public static String getMiddle(String words) {
        String word = words.toLowerCase();
        int middleNum = word.length() / 2;
        int roundedNum = Math.round(middleNum);
        if (word.length() % 2 == 0) {
            return word.charAt(roundedNum - 1) + "" + word.charAt(roundedNum);
        }
        return word.charAt(roundedNum) + "";
    }

    public static String doubleChar(String s){
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i)).append(s.charAt(i));
        }
        return sb.toString();
    }

}
