package com.example.exercismjavakatas.Arrays;

import java.util.*;

public class IntArray {

    public static int[] sortArray(int[] array) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbers.add(array[i]);
            }
        }
        oddNumbers.sort(Comparator.naturalOrder());
        Iterator<Integer> iterator = oddNumbers.iterator();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = iterator.next();
            }
        }
        return array;
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> newList = new ArrayList<>();
        for (Object obj : list) {
            if (obj instanceof Integer && (Integer) obj >= 0) {
                newList.add(obj);
            }
        }
        return newList;
    }

    public static double[] tribonacci(double[] s, int n) {
        double[] newArray = new double[n];  // Uzunligi ndan kichik bölishi kerak
        for (int i = 0; i < n; i++) {
            if (i < 3) {     // boshidagi 3 rqamni uzi turishi kerak
                newArray[i] = s[i];
            } else {
                newArray[i] = newArray[i-1] + newArray[i-2] + newArray[i-3];  // Fibanacciga öxshab qöshayapmiz bu yerd
            }
        }
        return newArray;
    }



}
