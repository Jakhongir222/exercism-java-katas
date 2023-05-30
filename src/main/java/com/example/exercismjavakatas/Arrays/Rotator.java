package com.example.exercismjavakatas.Arrays;

import java.util.Arrays;

public class Rotator {
    public Object[] rotate(Object[] data, int n) {

        int length= data.length;
        n %= length;
        if(n>0) {
            reverseArray(data, 0, length - 1);
            reverseArray(data, 0, n - 1);
            reverseArray(data, n, length - 1);
            }
        if(n<0) {
            reverseArray(data, 0, length - 1);
            reverseArray(data, 0, length + n - 1);
            reverseArray(data, length + n, length - 1);
        }
        return data;
    }
    public static void  reverseArray(Object [] arr, int start, int end){
        while(start<end){
            Object temp = arr[start];
            arr[start] =arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
