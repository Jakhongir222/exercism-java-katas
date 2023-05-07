package com.example.exercismjavakatas.CountDuplicates;

public class ASum {
    public static long findNb(long m){
        long n=1;  // I am beginning at the top, where it is equal to 1
        long sum =1;   // 1 ni uchinchisi 1 ga teng shuning uchun sum=1
        while(sum<m){
            n++;
            sum+=n*n*n;
        }
        if(sum==m){
            return n;
        }
        return -1;
    }
}
