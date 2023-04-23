package com.example.exercismjavakatas.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

public class IntArrayTest {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, IntArray.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, IntArray.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, IntArray.sortArray(new int[]{}));
    }
}
