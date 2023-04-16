package com.example.exercismjavakatas.BouncingBall;

import org.junit.Test;
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
}
