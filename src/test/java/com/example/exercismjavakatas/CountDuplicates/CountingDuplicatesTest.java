package com.example.exercismjavakatas.CountDuplicates;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountingDuplicatesTest {

    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a'); // bu testda new char[1000] ta characteri bor array yasayabdi, hammasi /0 ga teng, keyin uni a bn almashtirayapmiz
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, CountingDuplicates.duplicateCount(test));
    }
    @Test
    public void evenTests() {
        assertEquals("es", CountingDuplicates.getMiddle("test"));
        assertEquals("dd", CountingDuplicates.getMiddle("middle"));
        assertEquals("o", CountingDuplicates.getMiddle("JakhOngir"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", CountingDuplicates.getMiddle("testing"));
        assertEquals("a", CountingDuplicates.getMiddle("A"));
    }

    @Test
    public void sampleTest() {
        assertEquals("SSttrriinngg",CountingDuplicates.doubleChar("String"));
        assertEquals("HHeelllloo  WWoorrlldd",CountingDuplicates.doubleChar("Hello World"));
        assertEquals("11223344!!__  ",CountingDuplicates.doubleChar("1234!_ "));
    }
}
