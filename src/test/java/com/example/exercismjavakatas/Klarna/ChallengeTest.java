package com.example.exercismjavakatas.Klarna;

import org.junit.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChallengeTest {
    @Test
    public void example() {
        List<Integer> answer = Challenge.whoIsGoingHomeEarly(5, 3);
        List<Integer> expectedSolution = List.of(4, 3);
        assertTrue(answer.equals(expectedSolution));
    }
    @Test
    public void testWhoIsGoingHomeEarly_NegativeValues() {
        List<Integer> answer = Challenge.whoIsGoingHomeEarly(-5, 3);
        List<Integer> expectedSolution = List.of();

        assertTrue(answer.equals(expectedSolution));
    }

    @Test
    public void testWhoIsGoingHomeEarly_ZeroWorkers() {
        List<Integer> answer = Challenge.whoIsGoingHomeEarly(0, 3);
        List<Integer> expectedSolution = List.of();

        assertTrue(answer.equals(expectedSolution));
    }
}


