package com.example.exercismjavakatas.Klarna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovingAverageTest {
    @Test
    public void instructionsExampleTest() {
        MovingAverage movingAverage = new MovingAverage(3);
        assertEquals(Double.valueOf(3.0) , movingAverage.add(3));
        assertEquals(Double.valueOf(3.5) , movingAverage.add(4));
        assertEquals(Double.valueOf(4.0) , movingAverage.add(5));
        assertEquals(Double.valueOf(4.333333333333333) , movingAverage.add(4));
    }

    @Test
    public void instructionsExampleTest2() {
        MovingAverage movingAverage = new MovingAverage(2);
        assertEquals(Double.valueOf(3.0) , movingAverage.add(3));
        assertEquals(Double.valueOf(3.5) , movingAverage.add(4));
        assertEquals(Double.valueOf(4.5) , movingAverage.add(5));
        assertEquals(Double.valueOf(5.5) , movingAverage.add(6));
    }

    @Test
    public void instructionsExampleTest3() {
        MovingAverage movingAverage = new MovingAverage(1);
        assertEquals(Double.valueOf(3.0) , movingAverage.add(3));
        assertEquals(Double.valueOf(4.0) , movingAverage.add(4));
        assertEquals(Double.valueOf(5.0) , movingAverage.add(5));
        assertEquals(Double.valueOf(6.0) , movingAverage.add(6));
    }

    @Test
    public void windowSizeOfOneTest() {
        MovingAverage movingAverage = new MovingAverage(1);
        assertEquals(Double.valueOf(3.0), movingAverage.add(3));
        assertEquals(Double.valueOf(4.0), movingAverage.add(4));
        assertEquals(Double.valueOf(5.0), movingAverage.add(5));
        assertEquals(Double.valueOf(6.0), movingAverage.add(6));
    }

    @Test
    public void addingZeroTest() {
        MovingAverage movingAverage = new MovingAverage(3);
        assertEquals(Double.valueOf(0.0), movingAverage.add(0));
        assertEquals(Double.valueOf(0.0), movingAverage.add(0));
        assertEquals(Double.valueOf(0.0), movingAverage.add(0));
        assertEquals(Double.valueOf(0.0), movingAverage.add(0));
    }


}
