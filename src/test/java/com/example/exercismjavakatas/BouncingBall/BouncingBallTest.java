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
}
