package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Toolbox664Test {

    @Test
    void absoluteWorks() {
        assertEquals(5, Toolbox664.absolute(5));
        assertEquals(5, Toolbox664.absolute(-5));
    }

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Toolbox664.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Toolbox664.toFahrenheit(0.0), 1e-9);
    }

    @Test
    void loudWorks() {
        assertEquals("HELLO", Toolbox664.loud("hello"));
        assertEquals("ABC", Toolbox664.loud("aBc"));
    }
    @Test
    void testMaxOf() {
        assertEquals(5, Toolbox664.maxOf(3, 5));
    }

    @Test
    void testSum() {
        assertEquals(10, Toolbox664.sum(4, 6));
    }
    void testMaxOfExposesBug() {
        assertEquals(5, Toolbox664.maxOf(5, 2));
    }

    @Test
    void testSumExposesBug() {
        assertEquals(7, Toolbox664.sum(5, 2));
    }
}
