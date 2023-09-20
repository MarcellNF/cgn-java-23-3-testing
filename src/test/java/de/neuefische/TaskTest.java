package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void sum_whenAPlusB_thenExpectSumOfAPlusB() {
        // GIVEN
        int a = 10;
        int b = 10;
        int expected = 20;
        // WHEN
        int actual = Task.sum(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isEven_whenNisEven_thenReturnTrue() {
        // THEN
        assertTrue(Task.isEven(10));
    }

    @Test
    void isEven_whenNisNotEven_thenReturnFalse() {
        // GIVEN
        int n = 9;
        // WHEN
        boolean actual = Task.isEven(n);
        // THEN
        assertFalse(actual);
    }

    @Test
    void multiply_whenAMultipliedByB_thenExpectProductOfAMultipliedByB() {
        // GIVEN
        int a = 10;
        int b = 10;
        int expected = 100;
        // WHEN
        int actual = Task.multiply(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void wordToUpperCase_whenWordContainsLowerCaseCharacters_thenReturnWholeWordUpperCase() {
        // GIVEN
        String word = "Hello";
        String expected = "HELLO";
        // WHEN
        String actual = Task.wordToUpperCase(word);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isPositive_whenNumberIsPositive_thenReturnTrue() {
        // GIVEN
        int n = 10;
        // WHEN
        boolean actual = Task.isPositive(n);
        // THEN
        assertTrue(actual);
    }

    @Test
    void isPositive_whenNumberIsNotPositiveOrZero_thenReturnFalse() {
        // GIVEN
        int n = -1;
        // WHEN
        boolean actual = Task.isPositive(n);
        // THEN
        assertFalse(actual);
    }
}