package com.example.exercismjavakatas.Shapes;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class ShapesTest {
    @Test
    public void sampleTests() {
        assertEquals(180, Shapes.sumOfAngles(3));
        assertEquals(360, Shapes.sumOfAngles(4));
    }

    @Test()
    public void shouldThrowException(){
        IllegalArgumentException exception= assertThrows(IllegalArgumentException.class, ()->{
            Shapes.sumOfAngles(2);
        });
        String expectedMessage = "It is not possible to make shape with 2 or less sides";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void Basic_Tests()
    {
        assertArrayEquals(new int[]{80,0}, Shapes.rowWeights(new int[]{80}));
        assertArrayEquals(new int[]{100,50}, Shapes.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{120,140}, Shapes.rowWeights(new int[]{50,60,70,80}));
    }
    @Test
    public void Odd_Vector_Length()
    {
        assertArrayEquals(new int[]{62,27}, Shapes.rowWeights(new int[]{13,27,49}));
        assertArrayEquals(new int[]{236,92}, Shapes.rowWeights(new int[]{70,58,75,34,91}));
        assertArrayEquals(new int[]{211,164}, Shapes.rowWeights(new int[]{29,83,67,53,19,28,96}));
    }
    @Test
    public void Even_Vector_Length()
    {
        assertArrayEquals(new int[]{100,50}, Shapes.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{150,151}, Shapes.rowWeights(new int[]{100,51,50,100}));
        assertArrayEquals(new int[]{207,235}, Shapes.rowWeights(new int[]{39,84,74,18,59,72,35,61}));
    }
}
