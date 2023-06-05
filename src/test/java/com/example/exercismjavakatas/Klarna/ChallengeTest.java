package com.example.exercismjavakatas.Klarna;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ChallengeTest {
    @Test
    public void example() {
        List<Integer> answer = Challenge.whoIsGoingHomeEarly(5, 2);
        List<Integer> expectedSolution = List.of(3, 1, 5);

        assertEquals(expectedSolution, answer);
    }
}


