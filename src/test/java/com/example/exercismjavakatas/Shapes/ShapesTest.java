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
}
