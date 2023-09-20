package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum_whenNumber1PlusNumber2_thenReturnSum() {
        // GIVEN
        int number1 = 10;
        int number2 = 10;
        int expected = 20;
        // WHEN
        int actual = Main.sum(number1, number2);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void sum_whenNumber1PlusNumber2NotEquals20_thenExpectAssertionError(){
        // GIVEN
        int number1 = 10;
        int number2 = 10;
        int expected = 21;
        // WHEN
        int actual = Main.sum(number1, number2);
        // THEN
        assertNotEquals(expected, actual);
    }
}