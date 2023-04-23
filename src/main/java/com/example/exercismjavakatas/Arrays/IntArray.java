package com.example.exercismjavakatas.Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

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
}
