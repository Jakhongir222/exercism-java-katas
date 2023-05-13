package com.example.exercismjavakatas.BouncingBall;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BouncingBallTest {

    @Test
    public void test1(){
        assertEquals(3, BouncingBall.BouncingBall(3.0, 0.66, 1.5));
    }

    @Test
    public void test2() {
        assertEquals(15, BouncingBall.BouncingBall(30.0, 0.66, 1.5));
    }

    @Test
    public void test3() {
        assertEquals(19, BouncingBall.BouncingBall(90.0, 0.66, 1.5));
    }

    Random rand;

    @Before
    public void initTest() {
        rand = new Random();
    }

    @Test
    public void testExampleCases() {
        assertArrayEquals(new int[]{1,5}, BouncingBall.minMax(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{5, 2334454}, BouncingBall.minMax(new int[]{2334454,5}));
        assertArrayEquals(new int[]{1, 1}, BouncingBall.minMax(new int[]{1}));
    }

    @Test
    public void minMaxRandomTest() {
        for(int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(new int[]{r, r}, BouncingBall.minMax(new int[]{r}));
        }
    }

    @Test
    public void basicTests() {
        int[][] arr = {
                {0, 0},
                {1, 5},
                {3, 5},
                {5, 5},
                {7, 10},
                {39, 40},
                {-35, -35}
        };
        Arrays.stream(arr)
                .forEach(
                        (testCase) -> {
                            assertEquals(
                                    "Input: " + testCase[0],
                                    testCase[1],
                                    BouncingBall.roundToNext5(testCase[0]));
                        });
    }

    @Test
    public void BasicTests() {
        assertEquals(16, BouncingBall.sum(new int[] { 6, 2, 1, 8, 10}));
    }

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, BouncingBall.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   BouncingBall.isSquare(0));
        assertEquals("3 isn't a square number", false,  BouncingBall.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   BouncingBall.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   BouncingBall.isSquare(25));
        assertEquals("26 isn't a square number",false,  BouncingBall.isSquare(26));
    }
}
