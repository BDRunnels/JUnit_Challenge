package com.bdr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UtilitiesTestParameterized {

    private Utilities util;
    private String input;
    private String output;

    @BeforeEach
    public void setUp() {
        util = new Utilities();
    }


    public static Stream<Arguments> testConditions() {
        return Stream.of(
                Arguments.of("ABCDEFF", "ABCDEF"),
                Arguments.of("AB88EFFG", "AB8EFG"),
                Arguments.of("112233445566", "123456"),
                Arguments.of("A", "A")
                );
    }

    @ParameterizedTest
    @MethodSource("testConditions")
    void testRemovePairs(String input, String output) {
        assertEquals(output,util.removePairs(input));
    }
}
