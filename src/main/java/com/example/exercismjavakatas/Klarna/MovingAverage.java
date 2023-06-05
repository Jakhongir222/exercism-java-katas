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

/*
Moving Average
Average definition:

The result you get by adding two or more amounts together and dividing the total by the number of amounts.
Source: Cambridge

In this problem, we want you to implement a Moving Average algorithm.

A moving average algorithm is an algorithm that receives a positive integer X and return the average compared to the N latest numbers.

Constraints
N can be any number from 0 to 999999

0 < N < 999999

X can be any number from 0 to 9999999999

0 < X < 9999999999

Examples
MovingAverage(3)
add(3) == 3.0
add(4) == 3.5
add(5) == 4.0
add(4) == 4.333333333333333
MovingAverage(2)
add(3) == 3.0
add(4) == 3.5
add(5) == 4.5
add(6) == 5.5
MovingAverage(1)
add(3) == 3.0
add(4) == 4.0
add(5) == 5.0
add(6) == 6.0
Task & Objectives
You must implement the logic for calling the MovingAverage class and the add method, which will return the moving average of the latest N elements added.

Tests
Please write the tests that you think are relevant for this context
 */

