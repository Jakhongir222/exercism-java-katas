package com.example.exercismjavakatas.AccumString;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BioTest {
    @Test
    public void testDna() throws Exception {
        Bio b = new Bio();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        Bio b = new Bio();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: revRot");
        testing(Bio.revRot("1234", 0), "");
        testing(Bio.revRot("", 0), "");
        testing(Bio.revRot("1234", 5), "");
        String s = "733049910872815764";
        testing(Bio.revRot(s, 5), "330479108928157");
    }

    @Test
    void replaceLowercaseVowels() {
        assertEquals("hll", Bio.shortcut("hello"));
        assertEquals("hw r y tdy?", Bio.shortcut("how are you today?"));
        assertEquals("cmpln", Bio.shortcut("complain"));
        assertEquals("nvr", Bio.shortcut("never"));
    }

    @Test public void test4a() {
        assertEquals("aaaa", Bio.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", Bio.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", Bio.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", Bio.repeatStr(0, "kata"));
    }
}
