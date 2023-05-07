package com.example.exercismjavakatas.CountDuplicates;

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
            num = product;  // assigning new value for the number and starting over
            count++;
        }
        return count;
    }
}
