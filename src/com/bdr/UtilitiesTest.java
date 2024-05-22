package com.bdr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private Utilities util;
    @BeforeEach
    void setUp() {
        util = new Utilities();
    }
    @Test
    void everyNthChar() {

        assertArrayEquals(
                new char[]{'e', 'l'},
                util.everyNthChar(new char[]{'h','e','l','l','o'}, 2)
        );
        assertArrayEquals(
                new char[]{'h','e'},
                util.everyNthChar(new char[]{'h','e'}, 3)
        );
        assertNull(
                util.everyNthChar(null, 2),
                "Did not return null when source null"
        );
    }

    @Test
    void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull(
                util.removePairs(null),
                "Did not get null returned when arg passed is null"
        );
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @Test
    void converter() {
        assertEquals(300, util.converter(10, 5));

        assertThrows(ArithmeticException.class, () -> {
            util.converter(10, 0);
        });
    }

    @Test
    void nullIfOddLength() {
        assertNull(util.nullIfOddLength("hello"), "Did not return null on odd length");
        assertNotNull(util.nullIfOddLength("good"), "Did return null on even length");
    }
}