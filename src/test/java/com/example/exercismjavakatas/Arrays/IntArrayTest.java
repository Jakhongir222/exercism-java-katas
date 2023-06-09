package com.example.exercismjavakatas.Arrays;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntArrayTest {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, IntArray.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{1, 3, 5, 8, 0}, IntArray.sortArray(new int[]{5, 3, 1, 8, 0}));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, IntArray.sortArray(new int[]{}));
    }

    @Test
    public void examples() {
        assertEquals(List.of(1, 2), IntArray.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        assertEquals(List.of(1, 0, 15), IntArray.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        assertEquals(List.of(1, 2, 123), IntArray.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }

    private double precision = 1e-10;
    @Test
    public void sampleTests() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, IntArray.tribonacci(new double []{1,1,1},10), precision);
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, IntArray.tribonacci(new double []{0,0,1},10), precision);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, IntArray.tribonacci(new double []{0,1,1},10), precision);
    }
}
