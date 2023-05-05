package com.example.exercismjavakatas.Arrays;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(s -> s.matches("^[: ;][-~]?[)D]")).count();
    }
}

