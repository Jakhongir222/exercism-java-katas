package com.example.exercismjavakatas.Arrays;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SmileFacesTest {

    @Test
    public void staticTests() {
        check("samurai", "ai", true);
        check("sumo", "omo", false);
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false);
    }

    private static void check(String str, String ending, boolean expected) {
        boolean result = SmileFaces.solution(str, ending);
        assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
    }

    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, SmileFaces.countSmileys(a));
    }

    @Test
    public void test4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test5() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, SmileFaces.countSmileys(a));
    }
}
