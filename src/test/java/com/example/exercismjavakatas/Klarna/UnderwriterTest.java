package com.example.exercismjavakatas.Klarna;

import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnderwriterTest {
    @Test
    public void sampleTest1() {
        String[] input = {
                "john,20,800,stockholm",
                "john,50,100,beijing"
        };
        String[] expectedOutput = {
                "john,20,800,stockholm",
                "john,50,100,beijing"
        };

        assertListsEqual(expectedOutput, Underwriter.identifyInvalidTransactions(input));
    }

    @Test
    public void sampleTest2() {
        String[] input = {
                "john,20,200,stockholm",
                "john,50,200,stockholm"
        };
        String[] expectedOutput = {
                "john,20,200,stockholm",
                "john,50,200,stockholm"
        };

        assertListsEqual(expectedOutput, Underwriter.identifyInvalidTransactions(input));

    }


    @Test
    public void sampleTest3() {
        String[] input = {
                "john,20,150,stockholm",
                "john,20,300,stockholm"
        };
        String[] expectedOutput = {
                "john,20,150,stockholm",
                "john,20,300,stockholm"
        };

        assertListsEqual(expectedOutput, Underwriter.identifyInvalidTransactions(input));
    }

    @Test
    public void sampleTest4() {
        String[] input = {
                "john,20,150,stockholm",
                "john,30,300,stockholm"
        };
        String[] expectedOutput = {};

        assertListsEqual(expectedOutput, Underwriter.identifyInvalidTransactions(input));
    }

    private void assertListsEqual(String[] l1, String[] l2) {
        Collection<String> c1 = List.of(l2);
        Collection<String> c2 = List.of(l1);
        assertTrue(c1.containsAll(c2) && c2.containsAll(c1));
    }


    @Test
    public void additionalTest1() {
        String[] input = {
                "alice,10,1000,london",
                "bob,20,2000,paris",
                "alice,30,1000,london",
                "bob,50,2000,paris"
        };
        String[] expectedOutput = {
                "alice,10,1000,london",
                "alice,30,1000,london",
                "bob,20,2000,paris",
                "bob,50,2000,paris"
        };

        assertListsEqual(expectedOutput, Underwriter.identifyInvalidTransactions(input));
    }


    @Test
    public void additionalTest2() {
        String[] input = {
                "john,10,1500,new york",
                "john,20,1000,new york",
                "john,30,500,new york"
        };
        String[] expectedOutput = {};

        assertListsEqual(expectedOutput, Underwriter.identifyInvalidTransactions(input));
    }
}
