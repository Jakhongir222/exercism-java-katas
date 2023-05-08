package com.example.exercismjavakatas.CountDuplicates;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersistTest {

    @Test
    public void basicTests() {
        assertEquals(3, Persist.persistence( 39), "Incorrect answer for n=39" );
        assertEquals(0, Persist.persistence(  4), "Incorrect answer for n=4"  );
        assertEquals(2, Persist.persistence( 25), "Incorrect answer for n=25" );
        assertEquals(4, Persist.persistence(999), "Incorrect answer for n=999");
    }

    @Test
    @Order(1)
    public void testEmptyString() {
        Map<Character, Integer> d = new HashMap<>();
        assertEquals(d, Persist.count(""));
    }

    @Test
    @Order(2)
    public void testSingleCharacter() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        assertEquals(d, Persist.count("a"));
    }

    @Test
    @Order(3)
    public void testMultipleCharacters() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 3);
        d.put('b', 3);
        d.put('c', 1);
        assertEquals(d, Persist.count("aabbbac"));
    }

    @Test
    @Order(4)
    public void testAllCharactersUnique() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        d.put('b', 1);
        d.put('c', 1);
        assertEquals(d, Persist.count("abc"));
    }

    @Test
    @Order(5)
    public void testAllCharactersSame() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 5);
        assertEquals(d,  Persist.count("aaaaa"));
    }

    @Test
    @Order(6)
    public void testDifferentCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = Persist.count("aabb");
        assertEquals(expected, actual);
    }
}
