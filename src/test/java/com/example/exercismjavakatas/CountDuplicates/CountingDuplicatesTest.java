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

    @Test
    public void test() {
        assertEquals(3,CountingDuplicates.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,CountingDuplicates.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,CountingDuplicates.findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals(3,CountingDuplicates.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals(-1,CountingDuplicates.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals(1,CountingDuplicates.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,CountingDuplicates.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
}
