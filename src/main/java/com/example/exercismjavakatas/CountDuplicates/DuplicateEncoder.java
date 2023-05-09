package com.example.exercismjavakatas.CountDuplicates;

import java.util.Collection;
import java.util.LinkedList;

public class DuplicateEncoder {
    public static String encode(String word){
        StringBuilder sb = new StringBuilder();
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(word.indexOf(c) == word.lastIndexOf(c)){  //agar bitta bölsa , birinchi va oxirgi intexi teng bölsa ( qaytariladi
                sb.append("(");
            }else{
                sb.append(")");
            }
        }
        return sb.toString();
    }
}
