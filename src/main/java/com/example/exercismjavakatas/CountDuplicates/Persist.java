package com.example.exercismjavakatas.CountDuplicates;

import java.util.HashMap;
import java.util.Map;

public class Persist {
    public static int persistence(int num) {
        int count = 0;
        while (num >= 10) {
            int product = 1;
            String numStr = Integer.toString(num);
            for (int i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                product *= digit;
            }
            num = product;  // Assigning new value for the number and starting over
            count++;
        }
        return count;
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character , Integer> map = new HashMap<>();
        if(str == null) {
            return map;
        }
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1); // Increment count for character, Map.getOrDefault
            // it will get the correct incremented number or by default O and adds 1
        }
        return map;
    }

    public static double find_average(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        double average = (double) sum / array.length; // need to calculate outside the for loop
        return average;
    }
}
