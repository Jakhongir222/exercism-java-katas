package com.example.exercismjavakatas.Shapes;

public class Shapes {
    // find the sum of the internal angles in given n polygon
    public static int sumOfAngles(int n) {
        if(n<=2){ throw new IllegalArgumentException("It is not possible to make shape with 2 or less sides");}
        return (n-2)*180;
    }
}
