package com.example.exercismjavakatas.Shapes;

import java.util.Arrays;

public class Shapes {
    // find the sum of the internal angles in given n polygon
    public static int sumOfAngles(int n) {
        if(n<=2){ throw new IllegalArgumentException("It is not possible to make shape with 2 or less sides");}
        return (n-2)*180;
    }

    // in a row there numbers, sort them into 2 arrays and sum them together
    public static int[] rowWeights (final int[] weights) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i< weights.length; i++){
            if(i%2==0){
                sum1+=weights[i];
            }else{
                sum2+=weights[i];
            }
        }
        return new int[]{sum1, sum2};
    }

    public static int [][] multiplicationTable(int n){
        int [][] table =new int[n][n];
        for(int i=0; i<=n; i++){
            for(int j=0; j<n; j++){
                table[i][j]=(i+1)*(j+1);
            }
        }
        return table;
    }




}
