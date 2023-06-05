package com.example.exercismjavakatas.Klarna;

import java.util.ArrayList;
import java.util.List;

class MovingAverage {
    private List<Integer> numbers;
    private int windowSize;

    public MovingAverage(int N) {
        numbers = new ArrayList<>();
        windowSize = N;
    }

    public double add(int X) {
        numbers.add(X);

        if (numbers.size() > windowSize) {
            numbers.remove(0);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}

