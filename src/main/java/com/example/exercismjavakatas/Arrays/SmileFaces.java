package com.example.exercismjavakatas.Arrays;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(s -> s.matches("^[: ;][-~]?[)D]")).count();
    }

    public static boolean solution(String str, String ending) {
        if(ending.length()>str.length()) return false;
        int beginning = str.length() - ending.length();;
        String splitted = str.substring(beginning);
        return splitted.equals(ending);
    }
}

