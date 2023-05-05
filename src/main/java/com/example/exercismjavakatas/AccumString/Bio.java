package com.example.exercismjavakatas.AccumString;

public class Bio {
    public String dnaToRna(String dna){
        String result = dna.replaceAll("T", "U");
        return result;
    }
}
