package com.example.exercismjavakatas.Katas;

import java.util.ArrayList;
import java.util.List;

public class Snail {
    public static int[] snail(int[][] arr) {
        if (arr[0].length == 0) return new int[0];

        int n = arr.length - 1;
        List<Integer> turnNum = new ArrayList<>();
        turnNum.add(n);
        while (n > 0) {
            turnNum.add(n);
            turnNum.add(n);
            n--;
        }
        List<Integer> solution = new ArrayList<>();

        int x = 0;
        int y = 0;

        int sign = -1;

        solution.add(arr[0][0]);
        for (int i = 0; i < turnNum.size(); i++) {
            if (i % 2 == 0) sign = sign * -1;
            for (int j = 0; j < turnNum.get(i); j++) {
                if (i % 2 == 0) {
                    x += sign;
                } else {
                    y += sign;
                }
                solution.add(arr[y][x]);
            }
        }
        return solution.stream().mapToInt(i -> i).toArray();
    }
}
