package com.example.exercismjavakatas.PrimeNumbers;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        int[] primeNumbers = new int[0];
        long[] result = new long[2];
        int index = 0;

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers = resizeArray(primeNumbers, index + 1);
                primeNumbers[index] = (int) i;
                index++;
            }
        }

        for (int j = 0; j < primeNumbers.length - 1; j++) {
            if (primeNumbers[j + 1] - primeNumbers[j] == g) {
                result[0] = primeNumbers[j];
                result[1] = primeNumbers[j + 1];
                return result;
            }
        }

        return null;
    }

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, Math.min(array.length, newSize));
        return newArray;
    }


}
