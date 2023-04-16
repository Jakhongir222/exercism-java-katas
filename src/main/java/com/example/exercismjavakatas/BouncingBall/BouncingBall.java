package com.example.exercismjavakatas.BouncingBall;

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
}
