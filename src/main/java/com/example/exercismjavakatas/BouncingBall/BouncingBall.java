package com.example.exercismjavakatas.BouncingBall;

import java.util.Arrays;

public class BouncingBall {
    public static int BouncingBall(double h, double bounce, double window) {
        int count = -1; //It is -1 because I am incrementing 2 times below, when it falls down it is shown once
        if (bounce > 0 && bounce < 1 && window < h) {  // here I am checking the fraction of the bounce, which is 2/3 in the context (0.66)
            while (h > window) {
                h *= bounce; // Bu yerda kamayib boraveradi balandligi
                count += 2;
            }
        }
        return count;
    }

    public static int[] minMax(int[] arr) {
        int[] result = new int[2];
        result[0] = Arrays.stream(arr).min().getAsInt();
        result[1] = Arrays.stream(arr).max().getAsInt();
        return result;
    }

    public static int roundToNext5(int number) {
        if(number % 5 == 0) return number;
        int rounded = (int) Math.ceil((double)number/5);
        return 5*rounded;

    }

    public static int sum(int[] numbers){
        int sum=0;
        if (numbers == null || numbers.length == 0 ||numbers.length == 1) {
            return 0;
        }
        numbers = Arrays.stream(numbers).sorted().toArray();
        for(int i = 0; i<numbers.length; i++ ){
            sum+=numbers[i];
        }
        return sum - (numbers[0] + numbers[numbers.length-1]);
    }

    public static boolean isSquare(int n) {
        if(n>=0){
            int sqr = (int) Math.sqrt(n);
            return ((sqr * sqr) ==n);
        }
        return false;
    }
}
